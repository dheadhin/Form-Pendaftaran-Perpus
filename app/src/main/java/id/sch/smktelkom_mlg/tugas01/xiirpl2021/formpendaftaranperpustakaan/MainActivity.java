package id.sch.smktelkom_mlg.tugas01.xiirpl2021.formpendaftaranperpustakaan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText editTextNama, editTextHP, editTextEmail;
    Spinner spinnerKelas;
    RadioGroup radioGroupJK;
    RadioButton radioButtonL, radioButtonP;
    Spinner spinnerAgama;
    RadioGroup radioGroupOrgan;
    RadioButton radioButtonOsis, radioButtonMPK, radioButtonPramuka, radioButtonLain;
    CheckBox checkBox1, checkBox2, checkBox3;
    Button buttonDaftar;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
