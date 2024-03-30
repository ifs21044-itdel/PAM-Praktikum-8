package com.ifs21044.whatsapp

object ObjectKomunitas {
    // Arraylist and return the Arraylist
    fun getKomunitasData():ArrayList<Komunitas>{
        // create an arraylist of type employee class
        val komunitasList=ArrayList<Komunitas>()
        val kom1=Komunitas(R.drawable.komunitasnews,"NewsUpdate","tahnia: 271T bisa beli takjil sampe gumoh")
        komunitasList.add(kom1)
        val kom2=Komunitas(R.drawable.sukapaha,"Komunitas Pecinta Paha","robert: info paha yang makannya disuapi Scoups")
        komunitasList.add(kom2)
        val kom3=Komunitas(R.drawable.suamiicha,"Kumpulan calon suami icha","Scoups: OMG")
        komunitasList.add(kom3)

        return  komunitasList
    }
}