package com.example.kotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_check_box_radio_button.*

class CheckBoxRadioButton : AppCompatActivity() {

    /*lateinit var gender:RadioGroup
    lateinit var male:RadioButton
    lateinit var female:RadioButton
    lateinit var english:CheckBox
    lateinit var Hindi:CheckBox
    lateinit var malayalm:CheckBox
    lateinit var tamil:CheckBox
    lateinit var submit:Button
    lateinit var results:TextView*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box_radio_button)

        /*gender = findViewById(R.id.genderRadio) as RadioGroup
        male = findViewById(R.id.maleRadio) as RadioButton
        female = findViewById(R.id.femaleRadio) as RadioButton
        english = findViewById(R.id.checkEnglish) as CheckBox
        Hindi = findViewById(R.id.checkHindi) as CheckBox
        malayalm = findViewById(R.id.checkMalayalam) as CheckBox
        tamil = findViewById(R.id.checkTamil) as CheckBox
        submit = findViewById(R.id.btnSubmit) as Button
        results = findViewById(R.id.tvResult) as TextView*/

        btnSubmit.setOnClickListener {
            var result= " "
            if(genderRadio.checkedRadioButtonId != -1){
                result +="Selected gender : "
                if(maleRadio.isChecked)
                   result += "male\n"
                else
                    result += "female\n"
            }
            result += "Languages known : "
            if(checkEnglish.isChecked)
                result += "English\n"
            if(checkHindi.isChecked)
                result += "Hindi\n"
            if(checkMalayalam.isChecked)
                result += "Malayalam\n"
            if(checkTamil.isChecked)
                result += "tamil\n"

            tvResult.text = result
        }


    }
}
