package ua.com.zzz.davimuka.singlescreenapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView addressTextView = findViewById(R.id.addressTextView);
        TextView websiteTextView = findViewById(R.id.websiteTextView);
        TextView phoneTextView = findViewById(R.id.phoneTextView);
        TextView emailTextView = findViewById(R.id.emailTextView);

        addressTextView.setOnClickListener(onClickListener);
        websiteTextView.setOnClickListener(onClickListener);
        phoneTextView.setOnClickListener(onClickListener);
        emailTextView.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getId() == findViewById(R.id.addressTextView).getId()) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:48.61822333,22.29035036"));
                startActivity(intent);
            } else if (view.getId() == findViewById(R.id.websiteTextView).getId()) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.natureuzhhorod.ua/"));
                startActivity(intent);
            } else if (view.getId() == findViewById(R.id.phoneTextView).getId()) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+380312220458"));
                startActivity(intent);
            } else if (view.getId() == findViewById(R.id.emailTextView).getId()) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "natureuzhhorod@gmail.com", null));
                startActivity(intent);
            }
        }
    };
}


