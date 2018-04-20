package pingan.com.demo_4201;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button mDialog;

    private DialogFromBottom dialogFromBottom;
    private View dialogContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView() {
//        dialogContent = LayoutInflater.from(this).inflate(R.layout.dialog_layout, null, false);
        LayoutInflater from = LayoutInflater.from(this);
        View dialogContent = from.inflate(R.layout.dialog_layout, null, false);
        mDialog = (Button) findViewById(R.id.dialog);
        mDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFromBottom();
            }
        });

      TextView aa=(TextView) dialogContent.findViewById(R.id.textViewaaaa);

        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击关闭
                dialogFromBottom.dismiss();
            }
        });


        dialogFromBottom = new DialogFromBottom(this);
        dialogFromBottom.setContentView(dialogContent);
    }
    private void DialogFromBottom() {
        dialogFromBottom.show();
    }


}
