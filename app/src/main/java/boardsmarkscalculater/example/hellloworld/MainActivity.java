package boardsmarkscalculater.example.hellloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {


    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button =  findViewById(R.id.button);
        editText = findViewById(R.id.edittext);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/"+string));
                startActivity(intent);
            }
        });


    }

}