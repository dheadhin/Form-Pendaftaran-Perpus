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

        editTextNama = (EditText) findViewById(R.id.editTextNama);
        spinnerKelas = (Spinner) findViewById(R.id.spinnerKelas);
        radioGroupJK = (RadioGroup) findViewById(R.id.radioGroupJK);
        radioButtonL = (RadioButton) findViewById(R.id.radioButtonL);
        radioButtonP = (RadioButton) findViewById(R.id.radioButtonP);
        spinnerAgama = (Spinner) findViewById(R.id.spinnerAgama);
        editTextHP = (EditText) findViewById(R.id.editTextHP);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        radioGroupOrgan = (RadioGroup) findViewById(R.id.radioGroupOrgan);
        radioButtonOsis = (RadioButton) findViewById(R.id.radioButtonOsis);
        radioButtonMPK = (RadioButton) findViewById(R.id.radioButtonMPK);
        radioButtonPramuka = (RadioButton) findViewById(R.id.radioButtonPramuka);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        textViewHasil = (TextView) findViewById(R.id.textViewHasil);


    }
}
