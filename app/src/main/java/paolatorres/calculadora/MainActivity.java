package paolatorres.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double n1,n2,res;
    String operacion;

    public void Igual(View miView)
    {
        TextView campo = (TextView) findViewById(R.id.TextView) ;
        n2 = Double.parseDouble(campo.getText().toString());

        if(operacion.equals("+"))
        {
            res= n1+n2;
        }
        else if(operacion.equals("-"))
        {
            res= n1-n2;
        }
        else if(operacion.equals("x"))
        {
            res= n1*n2;
        }
        else if(operacion.equals("/"))
        {
            res= n1/n2;
        }
        campo.setText(res.toString());
    }

    public void Suma(View miView)
    {
        operacion="+";
        onClickOperacionCapturaNumero1(miView);
    }
    public void Resta(View miView)
    {
        operacion="-";
        onClickOperacionCapturaNumero1(miView);
    }
    public void Multiplicacion(View miView)
    {
        operacion="x";
        onClickOperacionCapturaNumero1(miView);
    }
    public void Division(View miView)
    {
        operacion="/";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView campo = (TextView) findViewById(R.id.TextView) ;
        n1 = Double.parseDouble(campo.getText().toString());
        campo.setText("");
    }

    public void Clean (View miView)
    {
        n1=0.0;
        n2=0.0;
        TextView campo = (TextView) findViewById(R.id.TextView) ;
        campo.setText("");
    }

    public void Btn1(View miView)
    {
        TextView campo = (TextView) findViewById(R.id.TextView) ;
        campo.setText(campo.getText() + "1");
    }
    public void Btn2(View miView)
    {
        TextView campo = (TextView) findViewById(R.id.TextView) ;
        campo.setText(campo.getText() + "2");
    }
    public void Btn3(View miView)
    {
        TextView campo = (TextView) findViewById(R.id.TextView) ;
        campo.setText(campo.getText() + "3");
    }
    public void Btn4(View miView)
    {
        TextView campo = (TextView) findViewById(R.id.TextView) ;
        campo.setText(campo.getText() + "4");
    }
    public void Btn5(View miView)
    {
        TextView campo = (TextView) findViewById(R.id.TextView) ;
        campo.setText(campo.getText() + "5");
    }
    public void Btn6(View miView)
    {
        TextView campo = (TextView) findViewById(R.id.TextView) ;
        campo.setText(campo.getText() + "6");
    }
    public void Btn7(View miView)
    {
        TextView campo = (TextView) findViewById(R.id.TextView) ;
        campo.setText(campo.getText() + "7");
    }
    public void Btn8(View miView)
    {
        TextView campo = (TextView) findViewById(R.id.TextView) ;
        campo.setText(campo.getText() + "8");
    }
    public void Btn9(View miView)
    {
        TextView campo = (TextView) findViewById(R.id.TextView) ;
        campo.setText(campo.getText() + "9");
    }
    public void Btn0(View miView)
    {
        TextView campo = (TextView) findViewById(R.id.TextView) ;
        campo.setText(campo.getText() + "0");
    }
    public void BtnPunto(View miView)
    {
        TextView campo = (TextView) findViewById(R.id.TextView) ;
        campo.setText(campo.getText() + ".");
    }

}
