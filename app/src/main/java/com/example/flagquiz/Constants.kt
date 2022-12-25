package com.example.flagquiz

object Constants {
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // 1 +
        val que1 = Question(1,R.drawable.georgia, "England", "Georgia", "Germany", "Denmark", 2)
        questionList.add(que1)

        //2 +
        val que2 = Question(2,R.drawable.armenia, "Albania", "Montenegro", "Armenia", "Lithuania", 3)
        questionList.add(que2)
        // 3 +
        val que3 = Question(3,R.drawable.germany, "Georgia", "Belgium", "Germany", "Netherlands", 3)
        questionList.add(que3)

        // 4 +
        val que4 = Question(4,R.drawable.azerbaijan, "Azerbaijan", "Georgia", "Armenia", "Andorra", 1)
        questionList.add(que4)

        // 5 +
        val que5 = Question(5,R.drawable.france, "Netherlands", "Russia", "Luxembourg", "France", 4)
        questionList.add(que5)

        //6 +
        val que6 = Question(6,R.drawable.finland, "Denmark", "Finland", "Norway", "Sweden", 2)
        questionList.add(que6)

        //7 +
        val que7 = Question(7,R.drawable.poland, "Malta", "Monaco", "Austria", "Poland", 4)
        questionList.add(que7)

        //8 +
        val que8 = Question(8,R.drawable.switzerland, "Switzerland", "Sweden", "Denmark", "Malta", 1)
        questionList.add(que8)

        //9 +
        val que9 = Question(9,R.drawable.north_macedonia, "North macedonia", "Serbia", "Slovenia", "Slovakia", 1)
        questionList.add(que9)

        //10 +
        val que10= Question(10,R.drawable.netherlands,  "Luxembourg","Netherlands", "Russia", "France", 2)
        questionList.add(que10)

        //11 +
        val que11= Question(10,R.drawable.lithuania, "Estonia", "Latvia", "Lithuania", "Bulgaria", 3)
        questionList.add(que11)

        //12 +
        val que12= Question(12,R.drawable.uk, "United States", "Ireland", "Iceland", "United Kingdom", 4)
        questionList.add(que12)

        //13 +
        val que13= Question(13,R.drawable.vatican_city, "Monaco", "San Marino", "Italy", "Vatican City", 4)
        questionList.add(que13)

        //14 +
        val que14= Question(14,R.drawable.ireland, "Italy", "Ireland", "Iceland", "Hungary", 2)
        questionList.add(que14)

        //15 +
        val que15= Question(15,R.drawable.italy, "Hungary", "Iceland", "Ireland", "Italy", 4)
        questionList.add(que15)

        //16 +
        val que16= Question(16,R.drawable.iceland, "Ireland", "Finland", "Iceland", "Norway", 3)
        questionList.add(que16)

        //17 +
        val que17= Question(17,R.drawable.greece, "Finland", "Greece", "Estonia", "Sweden", 2)
        questionList.add(que17)

        //18 +
        val que18= Question(18,R.drawable.spain, "Spain", "Portugal", "Germany", "Montenegro", 1)
        questionList.add(que18)

        //19 +
        val que19= Question(19,R.drawable.san_marino, "Malta", "Moldova", "San Marino", "Vatican City", 3)
        questionList.add(que19)

        //20 +
        val que20= Question(20,R.drawable.portugal, "Portugal", "Spain", "Monaco", "Croatia", 1)
        questionList.add(que20)

        //21 +
        val que21= Question(21,R.drawable.cyprus, "Vatican City", "Cyprus", "Greece", "Turkey", 2)
        questionList.add(que21)

        //22 +
        val que22= Question(22,R.drawable.andorra, "Ukraine", "Romania", "Andorra", "Moldova", 3)
        questionList.add(que22)

        //23 +
        val que23= Question(23,R.drawable.ukraine, "Ukraine", "Sweden", "Andorra", "Romania", 1)
        questionList.add(que23)

        return questionList
    }
}