package com.example.componentesbasicos;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoProduto;
    private TextView result;
    private CheckBox cbBranco, cbVerde, cbVrmelh;
    List<String> check = new ArrayList<>( );
    private RadioGroup rgEstoque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        campoProduto = findViewById( R.id.etNomeProduto );
        result = findViewById( R.id.resultado );
        cbBranco = findViewById( R.id.cbBranco );
        cbVerde = findViewById( R.id.cbVerde );
        cbVrmelh = findViewById( R.id.cbVermelho );
        rgEstoque = findViewById( R.id.rgEstoq );
    }
    public void verificaCheck(){
        check.clear();
        if (cbBranco.isChecked()){
            check.add( cbBranco.getText().toString());
        }
        if(cbVerde.isChecked()){
            check.add( cbVerde.getText().toString());
        }
        if(cbVrmelh.isChecked()){
            check.add( cbVrmelh.getText().toString() );
        }
        result.setText( check.toString());
    }
    public void btEnviar(View view){
        /*String nomeProduto = campoProduto.getText().toString();
        result.setText( nomeProduto );*/
        verificaCheck();
    }
    public void verificaRB(){
        rgEstoque.setOnCheckedChangeListener( new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId==R.id.rbSim){
                    result.setText( "Sim" );
                } else {
                    result.setText( "Não" );
                }
            }
        } );
    }
}
