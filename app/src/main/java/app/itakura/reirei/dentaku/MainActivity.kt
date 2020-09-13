package app.itakura.reirei.dentaku

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var firstNumber = 0
    var secondNumber = 0
    var totalnumber = 0
    var operator = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        kakeruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))


        plusButton.isEnabled = false
        minusButton.isEnabled = false
        kakeruButton.isEnabled = false
        equalButton.isEnabled = false

        numberText.text = firstNumber.toString()

        numberButton0.setOnClickListener {
            NumberButton(0)

        }

        numberButton1.setOnClickListener {
            NumberButton(1)
        }

        numberButton2.setOnClickListener {
            NumberButton(2)
        }

        numberButton3.setOnClickListener {
            NumberButton(3)
        }

        numberButton4.setOnClickListener {
            NumberButton(4)
        }

        numberButton5.setOnClickListener {
            NumberButton(5)
        }

        numberButton6.setOnClickListener {
            NumberButton(6)
        }

        numberButton7.setOnClickListener {
            NumberButton(7)
        }

        numberButton8.setOnClickListener {
            NumberButton(8)
        }

        numberButton9.setOnClickListener {
            NumberButton(9)
        }

        plusButton.setOnClickListener {

            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            kakeruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

            operator = "plus"

            numberText.text = secondNumber.toString()

        }

        minusButton.setOnClickListener {

            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            kakeruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

            operator = "minus"

            numberText.text = secondNumber.toString()

        }

        kakeruButton.setOnClickListener {

            kakeruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

            operator = "kakeru"

            numberText.text = secondNumber.toString()

        }

        equalButton.setOnClickListener {
            if(operator == "plus"){
                totalnumber = firstNumber + secondNumber
            }else if (operator == "minus"){
                totalnumber = firstNumber - secondNumber
            }else if(operator == "kakeru"){
                totalnumber = firstNumber * secondNumber
            }

            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            kakeruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

            firstNumber  = 0
            secondNumber = 0
            operator  = "empty"

            numberText.text = totalnumber.toString()

        }

        clearButton.setOnClickListener {
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            kakeruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

            firstNumber  = 0
            secondNumber = 0
            totalnumber = 0
            operator  = "empty"

            numberText.text = totalnumber.toString()

        }


    }

    fun NumberButton(i:Int){


            if (operator == "empty") {
                firstNumber = firstNumber * 10 + i

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 0))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 0))
                kakeruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 0))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                kakeruButton.isEnabled = true
                equalButton.isEnabled = true

            } else {
                secondNumber = secondNumber * 10 + i
                numberText.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
            }

    }
}