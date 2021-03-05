package com.bgdlnchk.sharedialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;

public class ShareDialog {

    private String message;
    private String description;
    private String googlePlayLink;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setLink(String googlePlayLink) {
        this.googlePlayLink = googlePlayLink;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void showDialog(Context context) {
        AlertDialog.Builder shareDialogBuilder = new AlertDialog.Builder(context);
        shareDialogBuilder.setMessage(message);
        shareDialogBuilder.setCancelable(true);

        shareDialogBuilder.setPositiveButton(
                "Yes",
                (dialog, id) -> {
                    Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                    sharingIntent.setType("text/plain");
                    String shareBody = description + " " + googlePlayLink;
                    sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject Here");
                    sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                    context.startActivity(Intent.createChooser(sharingIntent, "Share via"));
                });

        shareDialogBuilder.setNegativeButton(
                "No",
                (dialog, id) -> dialog.cancel());

        AlertDialog shareDialog = shareDialogBuilder.create();
        shareDialog.show();

    }
}