package com.example.calculadoracientifica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//import com.udojava.evalex.Expression
import net.objecthunter.exp4j.ExpressionBuilder
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtUser = findViewById<EditText>(R.id.edtUser)
        // ------------------------------------------------
        // Botões basicos ---------------------------------
        // ------------------------------------------------
        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)

        val btnPi = findViewById<Button>(R.id.btnPi)

        val btnMais = findViewById<Button>(R.id.btnAdicao)
        val btnsubtracao = findViewById<Button>(R.id.btnSubtracao)
        val btnMultiplicacao = findViewById<Button>(R.id.btnMultiplicacao)
        val btnDivisao = findViewById<Button>(R.id.btnDivisao)

        val btnPa = findViewById<Button>(R.id.btnPA)
        val btnPf = findViewById<Button>(R.id.btnPF)

        val btnIgual = findViewById<Button>(R.id.btnIgual)
        val resUser = findViewById<TextView>(R.id.resUser)

        val btnC = findViewById<Button>(R.id.btnC)
        val btnClear = findViewById<Button>(R.id.btnDelete)

        // ------------------------------------------------
        // Botões avançados ---------------------------------
        // ------------------------------------------------

        val btnSin = findViewById<Button>(R.id.btnSin)
        val btnCos = findViewById<Button>(R.id.btnCos)
        val btnTan = findViewById<Button>(R.id.btnTan)
        val btnLog = findViewById<Button>(R.id.btnLog)
        val btnExp = findViewById<Button>(R.id.btnExp)
        val btnMod = findViewById<Button>(R.id.btnMod)
        val btnCsc = findViewById<Button>(R.id.btnCsc)
        val btnCot = findViewById<Button>(R.id.btnCot)
        val btnSec = findViewById<Button>(R.id.btnSec)
        val btnHyp = findViewById<Button>(R.id.btnHyp)

        btn0.setOnClickListener({
            if(resUser.text.toString() == "0")
            {
                //edtUser.setText("0")
                resUser.setText("0")
            }else
            {
                //edtUser.setText(edtUser.text.toString()+"0")
                resUser.setText(resUser.text.toString()+"0")
            }
        })

        btn1.setOnClickListener({
            if(resUser.text.toString() == "0")
            {
                //edtUser.setText("1")
                resUser.setText("1")
            }else
            {
                //edtUser.setText(edtUser.text.toString()+"1")
                resUser.setText(resUser.text.toString()+"1")
            }
        })

        btn2.setOnClickListener({
            if(resUser.text.toString() == "0")
            {
                //edtUser.setText("2")
                resUser.setText("2")
            }else
            {
                //edtUser.setText(edtUser.text.toString()+"2")
                resUser.setText(resUser.text.toString()+"2")
            }
        })

        btn3.setOnClickListener({
            if(resUser.text.toString() == "0")
            {
                //edtUser.setText("3")
                resUser.setText("3")
            }else
            {
                //edtUser.setText(edtUser.text.toString()+"3")
                resUser.setText(resUser.text.toString()+"3")
            }
        })

        btn4.setOnClickListener({
            if(resUser.text.toString() == "0")
            {
                //edtUser.setText("4")
                resUser.setText("4")
            }else
            {
                //edtUser.setText(edtUser.text.toString()+"4")
                resUser.setText(resUser.text.toString()+"4")
            }
        })

        btn5.setOnClickListener({
            if(resUser.text.toString() == "0")
            {
                //edtUser.setText("5")
                resUser.setText("5")
            }else
            {
                //edtUser.setText(edtUser.text.toString()+"5")
                resUser.setText(resUser.text.toString()+"5")
            }
        })

        btn6.setOnClickListener({
            if(resUser.text.toString() == "0")
            {
                //edtUser.setText("6")
                resUser.setText("6")
            }else
            {
                //edtUser.setText(edtUser.text.toString()+"6")
                resUser.setText(resUser.text.toString()+"6")
            }
        })

        btn7.setOnClickListener({
            if(resUser.text.toString() == "0")
            {
                //edtUser.setText("7")
                resUser.setText("7")
            }else
            {
                //edtUser.setText(edtUser.text.toString()+"7")
                resUser.setText(resUser.text.toString()+"7")
            }
        })

        btn8.setOnClickListener({
            if(resUser.text.toString() == "0")
            {
                //edtUser.setText("8")
                resUser.setText("8")
            }else
            {
                //edtUser.setText(edtUser.text.toString()+"8")
                resUser.setText(resUser.text.toString()+"8")
            }
        })

        btn9.setOnClickListener({
            if(resUser.text.toString() == "0")
            {
                //edtUser.setText("9")
                resUser.setText("9")
            }else
            {
                //edtUser.setText(edtUser.text.toString()+"9")
                resUser.setText(resUser.text.toString()+"9")
            }
        })

        btnPi.setOnClickListener({
            if(resUser.text.toString() == "0")
            {
                //edtUser.setText("9")
                resUser.setText("3.14")
            }else
            {
                //edtUser.setText(edtUser.text.toString()+"9")
                resUser.setText(resUser.text.toString()+"3.14")
            }
        })


        btnMais.setOnClickListener({
            if(edtUser.text.toString() == "0")
            {
                edtUser.setText("0+")
            }else
            {
                edtUser.setText(edtUser.text.toString()+resUser.text+"+")
            }
        })

        btnsubtracao.setOnClickListener({
            if(edtUser.text.toString() == "0")
            {
                edtUser.setText("0-")
            }else
            {
                edtUser.setText(edtUser.text.toString()+"-")
            }
        })


        btnMultiplicacao.setOnClickListener({
            if(edtUser.text.toString() == "0")
            {
                edtUser.setText("0*")
            }else
            {
                edtUser.setText(edtUser.text.toString()+"*")
            }
        })

        btnDivisao.setOnClickListener({
            if(edtUser.text.toString() == "0")
            {
                edtUser.setText("0/")
            }else
            {
                edtUser.setText(edtUser.text.toString()+"/")
            }
        })

        btnPa.setOnClickListener({
            if(edtUser.text.toString() == "0")
            {
                edtUser.setText("(")
            }else
            {
                edtUser.setText(edtUser.text.toString()+"(")
            }
        })

        btnPf.setOnClickListener({
            if(edtUser.text.toString() == "0")
            {
                edtUser.setText("0")
            }else
            {
                edtUser.setText(edtUser.text.toString()+")")
            }
        })

        btnC.setOnClickListener({
            edtUser.setText("")
            resUser.setText("")
        })

        btnC.setOnClickListener({
            if (edtUser.text.toString() != "" || edtUser.text.toString() != "0") {
                edtUser.setText(edtUser.toString().dropLast(1))
            }
        })

        // Implementações complexas

        btnIgual.setOnClickListener({
            //val exp = Expression(edtUser.text.toString())
            //edtUser.setText(exp.eval().toDouble().toString())

            //val exp = ExpressionBuilder(edtUser.text.toString()).build()
            //edtUser.setText(exp.evaluate().toString())

            val exp = Expression(edtUser.text.toString())
            edtUser.setText(exp.calculate().toString())
        })

        btnSin.setOnClickListener({
            if(edtUser.text.toString() == "0" && resUser.text.toString() == "0")
            {
                edtUser.setText("0")
            }else
            {
                if(edtUser.text.toString() == "0") {
                    val exp = "sin(" + resUser.text.toString() + ")"
                    edtUser.setText(exp)
                    resUser.setText("")
                }
                else{
                    val exp = "sin(" + resUser.text.toString() + ")"
                    edtUser.setText(edtUser.text.toString()+exp)
                }
            }
        })

        btnCos.setOnClickListener({
            if(edtUser.text.toString() == "0" && resUser.text.toString() == "0")
            {
                edtUser.setText("0")
            }else
            {
                if(edtUser.text.toString() == "0") {
                    val exp = "cos(" + resUser.text.toString() + ")"
                    edtUser.setText(exp)
                    resUser.setText("")
                }
                else{
                    val exp = "cos(" + resUser.text.toString() + ")"
                    edtUser.setText(edtUser.text.toString()+exp)
                }
            }
        })

        btnTan.setOnClickListener({
            if(edtUser.text.toString() == "0" && resUser.text.toString() == "0")
            {
                edtUser.setText("0")
            }else
            {
                if(edtUser.text.toString() == "0") {
                    val exp = "tan(" + resUser.text.toString() + ")"
                    edtUser.setText(exp)
                    resUser.setText("")
                }
                else{
                    val exp = "tan(" + resUser.text.toString() + ")"
                    edtUser.setText(edtUser.text.toString()+exp)
                }
            }
        })

        btnLog.setOnClickListener({
            if(edtUser.text.toString() == "0" && resUser.text.toString() == "0")
            {
                edtUser.setText("0")
            }else
            {
                if(edtUser.text.toString() == "0") {
                    val exp = "log(" + resUser.text.toString() + ")"
                    edtUser.setText(exp)
                    resUser.setText("")
                }
                else{
                    val exp = "log(" + resUser.text.toString() + ")"
                    edtUser.setText(edtUser.text.toString()+exp)
                }
            }
        })

        btnExp.setOnClickListener({
            if(edtUser.text.toString() == "0" && resUser.text.toString() == "0")
            {
                edtUser.setText("0")
            }else
            {
                if(edtUser.text.toString() == "0") {
                    val exp = "exp(" + resUser.text.toString() + ")"
                    edtUser.setText(exp)
                    resUser.setText("")
                }
                else{
                    val exp = "exp(" + resUser.text.toString() + ")"
                    edtUser.setText(edtUser.text.toString()+exp)
                }
            }
        })

        btnMod.setOnClickListener({
            if(edtUser.text.toString() == "0" && resUser.text.toString() == "0")
            {
                edtUser.setText("0")
            }else
            {
                if(edtUser.text.toString() == "0") {
                    val exp = "mod(" + resUser.text.toString() + ")"
                    edtUser.setText(exp)
                    resUser.setText("")
                }
                else{
                    val exp = "mod(" + resUser.text.toString() + ")"
                    edtUser.setText(edtUser.text.toString()+exp)
                }
            }
        })

        btnHyp.setOnClickListener({
            if(edtUser.text.toString() == "0" && resUser.text.toString() == "0")
            {
                edtUser.setText("0")
            }else
            {
                if(edtUser.text.toString() == "0") {
                    val exp = "hyp(" + resUser.text.toString() + ")"
                    edtUser.setText(exp)
                    resUser.setText("")
                }
                else{
                    val exp = "hyp(" + resUser.text.toString() + ")"
                    edtUser.setText(edtUser.text.toString()+exp)
                }
            }
        })

        btnSec.setOnClickListener({
            if(edtUser.text.toString() == "0" && resUser.text.toString() == "0")
            {
                edtUser.setText("0")
            }else
            {
                if(edtUser.text.toString() == "0") {
                    val exp = "sec(" + resUser.text.toString() + ")"
                    edtUser.setText(exp)
                    resUser.setText("")
                }
                else{
                    val exp = "sec(" + resUser.text.toString() + ")"
                    edtUser.setText(edtUser.text.toString()+exp)
                }
            }
        })

        btnCsc.setOnClickListener({
            if(edtUser.text.toString() == "0" && resUser.text.toString() == "0")
            {
                edtUser.setText("0")
            }else
            {
                if(edtUser.text.toString() == "0") {
                    val exp = "csc(" + resUser.text.toString() + ")"
                    edtUser.setText(exp)
                    resUser.setText("")
                }
                else{
                    val exp = "csc(" + resUser.text.toString() + ")"
                    edtUser.setText(edtUser.text.toString()+exp)
                }
            }
        })

        btnCot.setOnClickListener({
            if(edtUser.text.toString() == "0" && resUser.text.toString() == "0")
            {
                edtUser.setText("0")
            }else
            {
                if(edtUser.text.toString() == "0") {
                    val exp = "cot(" + resUser.text.toString() + ")"
                    edtUser.setText(exp)
                    resUser.setText("")
                }
                else{
                    val exp = "cot(" + resUser.text.toString() + ")"
                    edtUser.setText(edtUser.text.toString()+exp)
                }
            }
        })

    }
}