package com.example.horoscopo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actvidad2 extends AppCompatActivity {
    private TextView tvh;
    private TextView tve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvidad2);
        tvh = (TextView)findViewById(R.id.textView5);
        tve = (TextView)findViewById(R.id.textView3);
        String dh = getIntent().getStringExtra("dias");
        String mh = getIntent().getStringExtra("meses");
        String ah = getIntent().getStringExtra("años");

    }

    //metodo para regresar
    public void anterior(View view){
        String dh = getIntent().getStringExtra("dias");
        String mh = getIntent().getStringExtra("meses");
        String ah = getIntent().getStringExtra("años");
        int num_d = Integer.parseInt(dh);
        int num_m = Integer.parseInt(mh);
        int num_a = Integer.parseInt(ah);
        int nan = 2019 - num_a;
        String result = String.valueOf(nan);
        tve.setText(result);


                if(num_d == 1913 || num_d == 1925 || num_d == 1937 || num_d == 1949 || num_d == 1961 || num_d == 1973 || num_d == 1985 || num_d == 1997 || num_d == 2009) {
                    tvh.setText("rata");
                }
                if(num_d == 1914 || num_d == 1926 || num_d == 1938 || num_d == 1950 || num_d == 1962 || num_d == 1974 || num_d == 1986 || num_d == 1998 || num_d == 2010){
                    tvh.setText("búfalo");
                }

                if(num_d == 1915 || num_d == 1927 || num_d == 1939 || num_d == 1951 || num_d == 1963 || num_d == 1975 || num_d == 1987 || num_d == 1999 || num_d == 2011){
                    tvh.setText("Tigre");
                }

                if(num_d == 1916 || num_d == 1928 || num_d == 1940 || num_d == 1952 || num_d == 1964 || num_d == 1976 || num_d == 1988 || num_d == 2000 || num_d == 2012){
                    tvh.setText("conejo");
                }

                if(num_d == 1917 || num_d == 1929 || num_d == 1941 || num_d == 1953 || num_d == 1965 || num_d == 1977 || num_d == 1989 || num_d == 2001 || num_d == 2013){
                    tvh.setText("dragón");
                }

                if(num_d == 1918 || num_d == 1930 || num_d == 1942 || num_d == 1954 || num_d == 1966 || num_d == 1978 || num_d == 1990 || num_d == 2002 || num_d == 2014){
                    tvh.setText("serpiente");
                }

                if(num_d == 1919 || num_d == 1931 || num_d == 1943 || num_d == 1955 || num_d == 1967 || num_d == 1979 || num_d == 1991 || num_d == 2003 || num_d == 2015){
                    tvh.setText("caballo");
                }

                if(num_d == 1920 || num_d == 1932 || num_d == 1944 || num_d == 1956 || num_d == 1968 || num_d == 1980 || num_d == 1992 || num_d == 2004 || num_d == 2016){
                    tvh.setText("cabra");
                }

                if(num_d == 1921 || num_d == 1933 || num_d == 1945 || num_d == 1957 || num_d == 1969 || num_d == 1981 || num_d == 1993 || num_d == 2005 || num_d == 2017){
                    tvh.setText("mono");
                }

                if(num_d == 1922 || num_d == 1934 || num_d == 1946 || num_d == 1958 || num_d == 1970 || num_d == 1982 || num_d == 1994 || num_d == 2006 || num_d == 2018){
                    tvh.setText("gallo");
                }

                if(num_d == 1923 || num_d == 1935 || num_d == 1947 || num_d == 1959 || num_d == 1971 || num_d == 1983 || num_d == 1995 || num_d == 2007 || num_d == 2019){
                    tvh.setText("perro");
                }

                if(num_d == 1924 || num_d == 1936 || num_d == 1948 || num_d == 1960 || num_d == 1972 || num_d == 1984 || num_d == 1996 || num_d == 2008 || num_d == 2020){
                    tvh.setText("cerdo");
                }



    }
}
