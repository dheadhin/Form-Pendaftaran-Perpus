package id.sch.smktelkom_mlg.tugas01.xiirpl2021.formpendaftaranperpustakaan;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    ArrayList <String> kelas = new ArrayList <String> ();
    ArrayList <String> agama = new ArrayList <String> ();
    String [] isikelas = {"X RPL 1", "X RPL 2","X RPL 3","X RPL 4","X TKJ 1","X TKJ 2","X TKJ 3","X TKJ 4"};
    String [] isiagama = {"Islam","Kristen","Katolik","Hindu","Budha", "Konghucu"};
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

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
        kelas.addAll(Arrays.asList(isikelas));
        agama.addAll(Arrays.asList(isiagama));
        buttonDaftar = (Button) findViewById(R.id.buttonDaftar) ;


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,kelas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerKelas.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,agama);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAgama.setAdapter(adapter2);

        buttonDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editTextNama.getText().toString();
                String kelas = spinnerKelas.getSelectedItem().toString();
                String jk = null;
                if (radioGroupJK.getCheckedRadioButtonId() == radioButtonL.getId()) {
                    jk = "Laki-laki";
                } else {
                    jk = "Perempuan";
                }
                String agama = spinnerAgama.getSelectedItem().toString();
                String HP = editTextHP.getText().toString();
                String email = editTextEmail.getText().toString();
                String organ = null;
                if (radioGroupOrgan.getCheckedRadioButtonId() == radioButtonOsis.getId()) {
                    organ = "Osis";
                } else if (radioGroupOrgan.getCheckedRadioButtonId() == radioButtonMPK.getId()){
                    organ = "MPK";
                } else if (radioGroupOrgan.getCheckedRadioButtonId() == radioButtonPramuka.getId()){
                    organ = "Pramuka";
                } else {
                    organ = "Lain-lain";
                }


                String keahlian = "";
                if (checkBox1.isChecked()) {
                    keahlian += "Berkomitmen menerapkan pembelajaran \n";
                }
                if (checkBox2.isChecked()) {
                    keahlian += "Menggunakan teknologi informasi \n";
                }
                if (checkBox3.isChecked()) {
                    keahlian += "Mengelola sumber daya informasi \n";
                }
                String hasil = "Nama : " +nama+ "\n" +
                        "Kelas : " +kelas+ "\n" +
                        "Jenis Kelamin : " +jk+ "\n" +
                        "Agama : " +agama+ "\n" +
                        "No. Handphone : " +HP+ "\n" +
                        "Email : " +email+ "\n" +
                        "Pengalaman Organisasi : " +organ+ "\n" +
                        "Keahlian : " +keahlian+ "\n" +
                        "BERHASIL DITAMBAHKAN";

                textViewHasil.setText(hasil);
            }
        });

    }
 }
