package com.ifs21044.whatsapp

object Constants {
    // Arraylist and return the Arraylist
    fun getEmployeeData():ArrayList<Employee>{
        // create an arraylist of type employee class
        val employeeList=ArrayList<Employee>()
        val emp1=Employee(R.drawable.ppicha,"Icha Samosir","어딜 가나 줄을 서 여자들은 날 보면", "Baru saja")
        employeeList.add(emp1)
        val emp2=Employee(R.drawable.wondergirll,"Wonder Girls","Nan dareun sarameun sileo", "12.00")
        employeeList.add(emp2)
        val emp3=Employee(R.drawable.naheedo,"2521","Meski sudah terlambat, selamat Nahe...", "Kemarin")
        employeeList.add(emp3)
        val emp4=Employee(R.drawable.scoups,"Soung Cheol","너무 너무 사랑해요 ", "Kemarin")
        employeeList.add(emp4)
        val emp5=Employee(R.drawable.woman,"anda: ","Amin juga", "Kemarin")
        employeeList.add(emp5)
        val emp6=Employee(R.drawable.yoja,"Yuju","Hello, this is Copilot! I’m the ony one.", "Kemarin")
        employeeList.add(emp6)
        val emp7=Employee(R.drawable.tone1,"TwoneOne","Hello, this is Copilot! I’m the new AI-powered chat mode of Mic", "Kemarin")
        employeeList.add(emp7)
        return  employeeList
    }
}