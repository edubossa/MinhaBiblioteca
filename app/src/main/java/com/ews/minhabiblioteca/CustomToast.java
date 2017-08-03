package com.ews.minhabiblioteca;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by wallace on 02/08/17.
 */
public class CustomToast {

    @Deprecated
    public static void showToast(Context context, String mensagem) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.custom_toast, null);

        Toast customToast = new Toast(context);
        customToast.setView(view);
        TextView textView = (TextView) view.findViewById(R.id.textView1);
        textView.setText(mensagem);
        customToast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
        customToast.setDuration(Toast.LENGTH_SHORT);
        customToast.show();
    }

    public static void showToast(Context context, String mensagem, Type type) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.custom_toast, null);

        Toast customToast = new Toast(context);
        customToast.setView(view);
        TextView textView = (TextView) view.findViewById(R.id.textView1);
        textView.setText(mensagem);

        switch (type) {
            case Error:
                textView.setTextColor(Color.RED);
                break;
            case Warning:
                textView.setTextColor(Color.BLUE);
                break;
            case Success:
                textView.setTextColor(Color.GREEN);
                break;
            case Info:
                textView.setTextColor(Color.MAGENTA);
                break;
            case Default:
                textView.setTextColor(Color.LTGRAY);
                break;
        }

        customToast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
        customToast.setDuration(Toast.LENGTH_LONG);
        customToast.show();
    }

}
