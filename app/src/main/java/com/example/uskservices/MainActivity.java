package com.example.uskservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    String site;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void website(String site)
    {
        this.site = site;
        Uri web = Uri.parse(site);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, web);
        startActivity(webIntent);
    }

    public void Simkuliah(View view)
    {
        website("https://simkuliah.unsyiah.ac.id/");
    }

    public void KRS(View view)
    {
        website("https://krsonline.unsyiah.ac.id/");
    }

    public void Simpeg(View view)
    {
        website("https://simpeg.unsyiah.ac.id/");
    }

    public void UKTB(View view)
    {
        website("https://uktb.unsyiah.ac.id/");
    }

    public void Arsip(View view)
    {
        website("https://arsip.unsyiah.ac.id/");
    }

    public void Siakad(View view)
    {
        website("https://siakad.unsyiah.ac.id/");
    }

    public void Beasiswa(View view)
    {
        website("https://beasiswa.unsyiah.ac.id/");
    }

    public void Wali(View view)
    {
        website("https://perwalian.unsyiah.ac.id/");
    }

    public void Simlit(View view)
    {
        website("http://simlit.unsyiah.ac.id/");
    }

    public void Simkeu(View view)
    {
        website("https://simkeu.unsyiah.ac.id/");
    }

    public void Survey(View view)
    {
        website("http://survey.unsyiah.ac.id/");
    }

    public void Repo(View view)
    {
        website("https://rp2u.unsyiah.ac.id/");
    }

    public void FSD(View view)
    {
        website("https://fsd.unsyiah.ac.id/login/");
    }

    public void KKN(View view)
    {
        website("https://kkn.usk.ac.id/");
    }

    public void PMB(View view)
    {
        website("https://pmb.unsyiah.ac.id/");
    }

    public void SIPL(View view)
    {
        website("https://pengaduan.unsyiah.ac.id/");
    }

    public void SIPKD(View view)
    {
        website("https://sipkd.unsyiah.ac.id/");
    }

    public void Simail(View view)
    {
        website("https://simail.unsyiah.ac.id/");
    }

    public void PortalData(View view)
    {
        website("https://data.unsyiah.ac.id/");
    }
}