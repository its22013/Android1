package jp.ac.it_college.std.s22013.listviewsample2

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class OrderConfirmDialogFragment : DialogFragment(){
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireActivity())
        .setTitle(R.string.dialog_title)
        .setMessage(R.string.dialog_msg)
        .setPositiveButton(R.string.dialog_btn_ok, dialogButtonClikListener)
        .setNegativeButton(R.string.dialog_btn_ng, dialogButtonClikListener)
        .setNeutralButton(R.string.dialog_btn_nu, dialogButtonClikListener)
        .create()
    private val dialogButtonClikListener =
        DialogInterface.OnClickListener { _, which ->
            val msg = when (which) {
                DialogInterface.BUTTON_POSITIVE -> getString(R.string.dialog_ok_toast)
                DialogInterface.BUTTON_NEGATIVE -> getString(R.string.dialog_ng_toast)
                DialogInterface.BUTTON_NEUTRAL -> getString(R.string.dialog_nu_toast)
                else  -> getString(R.string.dialog_ng_toast)
            }
            Toast.makeText(activity, msg, Toast.LENGTH_LONG).show()
        }
}