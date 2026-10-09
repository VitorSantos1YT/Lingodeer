package com.lingo.lingoskill.ruskill.ui.learn;

import a9.i;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import b7.e0;
import bo.d;
import c20.a;
import com.lingo.lingoskill.ruskill.ui.learn.adapter.RUSyllableAdapter1;
import com.lingo.lingoskill.ruskill.ui.learn.adapter.RUSyllableAdapter2;
import com.lingo.lingoskill.ruskill.ui.learn.adapter.RUSyllableAdapter3;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import fv.c;
import hj.e3;
import hj.t0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import ji.b;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import ry.r;
import th.j;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RUSyllableIndexActivity extends b {
    public static final /* synthetic */ int Z = 0;
    public final c P;
    public int Q;
    public final a R;
    public final i S;
    public final String T;
    public final String U;
    public final String V;
    public final String W;
    public final String X;
    public final aj.b Y;

    public RUSyllableIndexActivity() {
        super("AlphabetIntro", d.f4472a);
        this.P = new c();
        a aVar = new a(1, false);
        HashMap map = new HashMap();
        aVar.f6510b = map;
        map.clear();
        for (String str : "1\tА\n2\tа\n3\tБ\n4\tб\n5\tВ\n6\tв\n7\tГ\n8\tг\n9\tД\n10\tд\n11\tЕ\n12\tе\n13\tЁ\n14\tё\n15\tЖ\n16\tж\n17\tЗ\n18\tз\n19\tИ\n20\tи\n21\tЙ\n22\tй\n23\tК\n24\tк\n25\tЛ\n26\tл\n27\tМ\n28\tм\n29\tН\n30\tн\n31\tО\n32\tо\n33\tП\n34\tп\n35\tР\n36\tр\n37\tС\n38\tс\n39\tТ\n40\tт\n41\tУ\n42\tу\n43\tФ\n44\tф\n45\tХ\n46\tх\n47\tЦ\n48\tц\n49\tЧ\n50\tч\n51\tШ\n52\tш\n53\tЩ\n54\tщ\n55\tы\n56\tЭ\n57\tэ\n58\tЮ\n59\tю\n60\tЯ\n61\tя\n62\tа\n63\tо\n64\tу\n65\tы\n66\tэ\n67\tя\n68\tё\n69\tю\n70\tи\n71\tе\n72\tбанk\n73\tон\n74\tум\n75\tсын\n76\tмэр\n77\tмясо\n78\tёж\n79\tюг\n80\tи\n81\tтекст\n82\t/p/\n83\t/b/\n84\t/f/\n85\t/v/\n86\t/k/\n87\t/g/\n88\t/t/\n89\t/d/\n90\t/s/\n91\t/z/\n92\t/x/\n93\t/m/\n94\t/n/\n95\t/ɫ/\n96\t/r/\n97\t/р’/\n98\t/b’/\n99\t/f’/\n100\t/v’/\n101\t/k’/\n102\t/g’/\n103\t/t’/\n104\t/d’/\n105\t/s’/\n106\t/z’/\n107\t/x’/\n108\t/m’/\n109\t/n’/\n110\t/ɫ’/\n111\t/r’/\n112\tПутин\n112\tпутин\n113\tбанк\n114\tфлаг\n115\tваза\n116\tкофе\n117\tгаз\n118\tтут\n119\tда\n120\tсуп\n121\tзуб\n122\tхоккей\n123\tмама\n124\tнос\n125\tлампа\n126\tроза\n127\tпиво\n128\tбелый\n129\tФёдор\n129\tфёдор\n130\tсвязь\n131\tтокио\n132\tгитара\n133\tтётя\n134\tдядя\n135\tсестра\n136\tзима\n137\tхимия\n138\tмесяц\n139\tнет\n140\tлифт\n141\tрис\n142\tш\n143\tж\n144\tц\n145\tшампунь\n146\tжизнь\n147\tцарь\n148\tч\n149\tщ\n150\tй\n151\tчас\n152\tщека\n153\tмай\n154\tстатья\n155\tсъезд\n156\tбанан\n157\tоно\n158\tлампа\n159\tкосмос\n160\tсестра\n161\tязык\n162\tморе\n163\tдядя\n164\tши\n165\tше\n166\tжи\n167\tже\n168\tошибка\n169\tшеф\n170\tжизнь\n171\tтоже\n172\tпапа".split("\n")) {
            String[] strArrSplit = str.split("\t");
            aVar.f6510b.put(strArrSplit[1], strArrSplit[0]);
        }
        this.R = aVar;
        this.S = new i(1);
        this.T = "А а\nБ б\nВ в\nГ г\nД д\nЕ е\nЁ ё\nЖ ж\nЗ з\nИ и\nЙ й\nК к\nЛ л\nМ м\nН н\nО о\nП п\nР р\nС с\nТ т\nУ у\nФ ф\nХ х\nЦ ц\nЧ ч\nШ ш\nЩ щ\nъ\nы\nь\nЭ э\nЮ ю\nЯ я";
        this.U = "банан\n/bʌnˈan/\nоно\n/ʌnˈo/";
        this.V = "лампа\n/lˈampə/\nкосмос\n/kˈosməs/";
        this.W = "сестра\n/sistrˈa/\nязык\n/jɪzˈɨk/";
        this.X = "море\n/mˈorjə/\nдядя\n/djˈadjə/";
        this.Y = new aj.b(this, 1);
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.P.a(this.Q);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        List listK;
        List listT;
        List listK2;
        List listT2;
        List listK3;
        List listT3;
        List listK4;
        List listT4;
        List listK5;
        List listT5;
        List listK6;
        List listT6;
        List listK7;
        List listT7;
        List listK8;
        List listT8;
        List listK9;
        List listT9;
        List listK10;
        List listT10;
        List listK11;
        List listT11;
        ve.i.I(R.string.alphabet, this);
        String str = this.T;
        Matcher matcher = e0.u(0, "\n", "compile(...)", str, "input").matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, str, iC, arrayList);
            } while (matcher.find());
            p.B(iC, str, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(str.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        r rVar = r.f50854a;
        if (!zIsEmpty) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listT = rVar;
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    listT = e0.t(listIterator, 1, listK);
                    break;
                }
            }
        } else {
            listT = rVar;
            break;
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        RUSyllableAdapter1 rUSyllableAdapter1 = new RUSyllableAdapter1(o.L(Arrays.copyOf(strArr, strArr.length)), null, null);
        ((t0) j()).f33316l.setLayoutManager(new GridLayoutManager(5));
        ((t0) j()).f33316l.setAdapter(rUSyllableAdapter1);
        v(rUSyllableAdapter1);
        String string = getString(R.string.ru_alp_section_table_1);
        String string2 = getString(R.string.ru_alp_section_table_2);
        String string3 = getString(R.string.ru_alp_section_table_3);
        String string4 = getString(R.string.ru_alp_section_table_4);
        String string5 = getString(R.string.ru_alp_section_table_5);
        String string6 = getString(R.string.ru_alp_section_table_6);
        String string7 = getString(R.string.ru_alp_section_table_7);
        String string8 = getString(R.string.ru_alp_section_table_8);
        String string9 = getString(R.string.ru_alp_section_table_9);
        String string10 = getString(R.string.ru_alp_section_table_10);
        String string11 = getString(R.string.ru_alp_section_table_11);
        String string12 = getString(R.string.ru_alp_section_table_12);
        String string13 = getString(R.string.ru_alp_section_table_13);
        StringBuilder sbQ = e0.q(string, "\t", string2, "!&&&!", string3);
        com.google.android.material.datepicker.d.w(sbQ, "\nа\t/a/_банк!&&&!", string4, "\nо\t/o/_он!&&&!", string5);
        com.google.android.material.datepicker.d.w(sbQ, "\nу\t/u/_ум!&&&!", string6, "\nы\t/ɨ/_сын!&&&!", string7);
        com.google.android.material.datepicker.d.w(sbQ, "\nэ\t/e/_мэр!&&&!", string8, "\nя\t/ja/_мясо!&&&!", string9);
        com.google.android.material.datepicker.d.w(sbQ, "\nё\t/jo/_ёж!&&&!", string10, "\nю\t/ju/_юг!&&&!", string11);
        String strP = e.p(sbQ, "\nи\t/i/_и!&&&!", string12, "\nе\t/je/_текст!&&&!", string13);
        Matcher matcher2 = e0.u(0, "\n", "compile(...)", strP, "input").matcher(strP);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iC2 = 0;
            do {
                iC2 = p.c(matcher2, strP, iC2, arrayList2);
            } while (matcher2.find());
            p.B(iC2, strP, arrayList2);
            listK2 = arrayList2;
        } else {
            listK2 = o.K(strP.toString());
        }
        if (!listK2.isEmpty()) {
            ListIterator listIterator2 = listK2.listIterator(listK2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listT2 = rVar;
                    break;
                } else if (((String) listIterator2.previous()).length() != 0) {
                    listT2 = e0.t(listIterator2, 1, listK2);
                    break;
                }
            }
        } else {
            listT2 = rVar;
            break;
        }
        String[] strArr2 = (String[]) listT2.toArray(new String[0]);
        List listL = o.L(Arrays.copyOf(strArr2, strArr2.length));
        List listL2 = o.L("а", "о", "у", "ы", "э", "я", "ё", "ю", "и", "е");
        aj.b bVar = this.Y;
        RUSyllableAdapter3 rUSyllableAdapter3 = new RUSyllableAdapter3(listL, listL2, bVar);
        ((t0) j()).m.setLayoutManager(new LinearLayoutManager(1));
        ((t0) j()).m.setAdapter(rUSyllableAdapter3);
        String string14 = getString(R.string.ru_alp_section_table_14);
        String string15 = getString(R.string.ru_alp_section_table_15);
        String string16 = getString(R.string.ru_alp_section_table_4);
        String string17 = getString(R.string.ru_alp_section_table_16);
        String string18 = getString(R.string.ru_alp_section_table_17);
        String string19 = getString(R.string.ru_alp_section_table_18);
        String string20 = getString(R.string.ru_alp_section_table_19);
        String string21 = getString(R.string.ru_alp_section_table_20);
        String string22 = getString(R.string.ru_alp_section_table_21);
        String string23 = getString(R.string.ru_alp_section_table_22);
        String string24 = getString(R.string.ru_alp_section_table_23);
        String string25 = getString(R.string.ru_alp_section_table_24);
        String string26 = getString(R.string.ru_alp_section_table_25);
        String string27 = getString(R.string.ru_alp_section_table_26);
        String string28 = getString(R.string.ru_alp_section_table_27);
        String string29 = getString(R.string.ru_alp_section_table_28);
        String string30 = getString(R.string.ru_alp_section_table_29);
        String string31 = getString(R.string.ru_alp_section_table_30);
        String string32 = getString(R.string.ru_alp_section_table_31);
        String string33 = getString(R.string.ru_alp_section_table_32);
        String string34 = getString(R.string.ru_alp_section_table_33);
        String string35 = getString(R.string.ru_alp_section_table_34);
        String string36 = getString(R.string.ru_alp_section_table_35);
        String string37 = getString(R.string.ru_alp_section_table_36);
        String string38 = getString(R.string.ru_alp_section_table_37);
        String string39 = getString(R.string.ru_alp_section_table_38);
        String string40 = getString(R.string.ru_alp_section_table_39);
        String string41 = getString(R.string.ru_alp_section_table_40);
        String string42 = getString(R.string.ru_alp_section_table_41);
        String string43 = getString(R.string.ru_alp_section_table_42);
        StringBuilder sbS = e.s("п\t/p/!&&&!папа (", string14, ")!@@@!/p’/!&&&!пиво (", string15, ")\nб\t/b/!&&&!банк (");
        com.google.android.material.datepicker.d.w(sbS, string16, ")!@@@!/b’/!&&&!белый (", string17, ")\nф\t/f/!&&&!флаг (");
        com.google.android.material.datepicker.d.w(sbS, string18, ")!@@@!/f’/!&&&!Фёдор (", string19, ")\nв\t/v/!&&&!ваза (");
        com.google.android.material.datepicker.d.w(sbS, string20, ")!@@@!/v’/!&&&!связь (", string21, ")\nк\t/k/!&&&!кофе (");
        com.google.android.material.datepicker.d.w(sbS, string22, ")!@@@!/k’/!&&&!Tокио (", string23, ")\nг\t/g/!&&&!газ (");
        com.google.android.material.datepicker.d.w(sbS, string24, ")!@@@!/g’/!&&&!гитара (", string25, ")\nт\t/t/!&&&!тут (");
        com.google.android.material.datepicker.d.w(sbS, string26, ")!@@@!/t’/!&&&!тётя (", string27, ")\nд\t/d/!&&&!да (");
        com.google.android.material.datepicker.d.w(sbS, string28, ")!@@@!/d’/!&&&!дядя (", string29, ")\nс\t/s/!&&&!суп (");
        com.google.android.material.datepicker.d.w(sbS, string30, ")!@@@!/s’/!&&&!сестра (", string31, ")\nз\t/z/!&&&!зуб (");
        com.google.android.material.datepicker.d.w(sbS, string32, ")!@@@!/z’/!&&&!зима (", string33, ")\nх\t/x/!&&&!хоккей (");
        com.google.android.material.datepicker.d.w(sbS, string34, ")!@@@!/x’/!&&&!химия (", string35, ")\nм\t/m/!&&&!мама (");
        com.google.android.material.datepicker.d.w(sbS, string36, ")!@@@!/m’/!&&&!месяц (", string37, ")\nн\t/n/!&&&!нос (");
        com.google.android.material.datepicker.d.w(sbS, string38, ")!@@@!/n’/!&&&!нет (", string39, ")\nл\t/ɫ/!&&&!лампа (");
        com.google.android.material.datepicker.d.w(sbS, string40, ")!@@@!/ɫ’/!&&&!лифт (", string41, ")\nр\t/r/!&&&!роза (");
        String strP2 = e.p(sbS, string42, ")!@@@!/r’/!&&&!рис (", string43, ")");
        Matcher matcher3 = e0.u(0, "\n", "compile(...)", strP2, "input").matcher(strP2);
        if (matcher3.find()) {
            ArrayList arrayList3 = new ArrayList(10);
            int iC3 = 0;
            do {
                iC3 = p.c(matcher3, strP2, iC3, arrayList3);
            } while (matcher3.find());
            p.B(iC3, strP2, arrayList3);
            listK3 = arrayList3;
        } else {
            listK3 = o.K(strP2.toString());
        }
        if (!listK3.isEmpty()) {
            ListIterator listIterator3 = listK3.listIterator(listK3.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    listT3 = rVar;
                    break;
                } else if (((String) listIterator3.previous()).length() != 0) {
                    listT3 = e0.t(listIterator3, 1, listK3);
                    break;
                }
            }
        } else {
            listT3 = rVar;
            break;
        }
        String[] strArr3 = (String[]) listT3.toArray(new String[0]);
        RUSyllableAdapter2 rUSyllableAdapter2 = new RUSyllableAdapter2(o.L(Arrays.copyOf(strArr3, strArr3.length)), bVar);
        ((t0) j()).f33307c.setLayoutManager(new LinearLayoutManager(1));
        ((t0) j()).f33307c.setAdapter(rUSyllableAdapter2);
        String strK = ep.a.k(e.s("ш\t/ʃ/!&&&!шампунь (", getString(R.string.ru_alp_section_table_43), ")\nж\t/ʒ/!&&&!жизнь (", getString(R.string.ru_alp_section_table_44), ")\nц\t/ts/!&&&!царь ("), getString(R.string.ru_alp_section_table_45), ")\n");
        Matcher matcher4 = e0.u(0, "\n", "compile(...)", strK, "input").matcher(strK);
        if (matcher4.find()) {
            ArrayList arrayList4 = new ArrayList(10);
            int iC4 = 0;
            do {
                iC4 = p.c(matcher4, strK, iC4, arrayList4);
            } while (matcher4.find());
            p.B(iC4, strK, arrayList4);
            listK4 = arrayList4;
        } else {
            listK4 = o.K(strK.toString());
        }
        if (!listK4.isEmpty()) {
            ListIterator listIterator4 = listK4.listIterator(listK4.size());
            while (true) {
                if (!listIterator4.hasPrevious()) {
                    listT4 = rVar;
                    break;
                } else if (((String) listIterator4.previous()).length() != 0) {
                    listT4 = e0.t(listIterator4, 1, listK4);
                    break;
                }
            }
        } else {
            listT4 = rVar;
            break;
        }
        String[] strArr4 = (String[]) listT4.toArray(new String[0]);
        RUSyllableAdapter2 rUSyllableAdapter4 = new RUSyllableAdapter2(o.L(Arrays.copyOf(strArr4, strArr4.length)), bVar);
        ((t0) j()).f33308d.setLayoutManager(new LinearLayoutManager(1));
        ((t0) j()).f33308d.setAdapter(rUSyllableAdapter4);
        String strK2 = ep.a.k(e.s("ч\t/ʧ/!&&&!час (", getString(R.string.ru_alp_section_table_46), ")\nщ\t/ʃʧ/!&&&!щека (", getString(R.string.ru_alp_section_table_47), ")\nй\t/j/!&&&!май ("), getString(R.string.ru_alp_section_table_48), ")\n");
        Matcher matcher5 = e0.u(0, "\n", "compile(...)", strK2, "input").matcher(strK2);
        if (matcher5.find()) {
            ArrayList arrayList5 = new ArrayList(10);
            int iC5 = 0;
            do {
                iC5 = p.c(matcher5, strK2, iC5, arrayList5);
            } while (matcher5.find());
            p.B(iC5, strK2, arrayList5);
            listK5 = arrayList5;
        } else {
            listK5 = o.K(strK2.toString());
        }
        if (!listK5.isEmpty()) {
            ListIterator listIterator5 = listK5.listIterator(listK5.size());
            while (true) {
                if (!listIterator5.hasPrevious()) {
                    listT5 = rVar;
                    break;
                } else if (((String) listIterator5.previous()).length() != 0) {
                    listT5 = e0.t(listIterator5, 1, listK5);
                    break;
                }
            }
        } else {
            listT5 = rVar;
            break;
        }
        String[] strArr5 = (String[]) listT5.toArray(new String[0]);
        RUSyllableAdapter2 rUSyllableAdapter5 = new RUSyllableAdapter2(o.L(Arrays.copyOf(strArr5, strArr5.length)), bVar);
        ((t0) j()).f33309e.setLayoutManager(new LinearLayoutManager(1));
        ((t0) j()).f33309e.setAdapter(rUSyllableAdapter5);
        String strR = p.r(getString(R.string.ru_alp_section_table_52), " “ь”\nстатья\n/stʌtˈja/\n", getString(R.string.ru_alp_section_table_53), " “ъ”\nсъезд\n/sjˈest/");
        Matcher matcher6 = e0.u(0, "\n", "compile(...)", strR, "input").matcher(strR);
        if (matcher6.find()) {
            ArrayList arrayList6 = new ArrayList(10);
            int iC6 = 0;
            do {
                iC6 = p.c(matcher6, strR, iC6, arrayList6);
            } while (matcher6.find());
            p.B(iC6, strR, arrayList6);
            listK6 = arrayList6;
        } else {
            listK6 = o.K(strR.toString());
        }
        if (!listK6.isEmpty()) {
            ListIterator listIterator6 = listK6.listIterator(listK6.size());
            while (true) {
                if (!listIterator6.hasPrevious()) {
                    listT6 = rVar;
                    break;
                } else if (((String) listIterator6.previous()).length() != 0) {
                    listT6 = e0.t(listIterator6, 1, listK6);
                    break;
                }
            }
        } else {
            listT6 = rVar;
            break;
        }
        String[] strArr6 = (String[]) listT6.toArray(new String[0]);
        RUSyllableAdapter1 rUSyllableAdapter6 = new RUSyllableAdapter1(o.L(Arrays.copyOf(strArr6, strArr6.length)), o.L(" ", "ь", " ", " ", "ъ", " "), o.L(" ", "статья", " ", " ", "съезд", " "));
        ((t0) j()).f33310f.setLayoutManager(new GridLayoutManager(3));
        ((t0) j()).f33310f.setAdapter(rUSyllableAdapter6);
        v(rUSyllableAdapter6);
        String str2 = this.U;
        Matcher matcher7 = e0.u(0, "\n", "compile(...)", str2, "input").matcher(str2);
        if (matcher7.find()) {
            ArrayList arrayList7 = new ArrayList(10);
            int iC7 = 0;
            do {
                iC7 = p.c(matcher7, str2, iC7, arrayList7);
            } while (matcher7.find());
            p.B(iC7, str2, arrayList7);
            listK7 = arrayList7;
        } else {
            listK7 = o.K(str2.toString());
        }
        if (!listK7.isEmpty()) {
            ListIterator listIterator7 = listK7.listIterator(listK7.size());
            while (true) {
                if (!listIterator7.hasPrevious()) {
                    listT7 = rVar;
                    break;
                } else if (((String) listIterator7.previous()).length() != 0) {
                    listT7 = e0.t(listIterator7, 1, listK7);
                    break;
                }
            }
        } else {
            listT7 = rVar;
            break;
        }
        String[] strArr7 = (String[]) listT7.toArray(new String[0]);
        RUSyllableAdapter1 rUSyllableAdapter7 = new RUSyllableAdapter1(o.L(Arrays.copyOf(strArr7, strArr7.length)), o.L("а", " ", "о", " "), o.L("банан", " ", "оно", " "));
        ((t0) j()).f33311g.setLayoutManager(new GridLayoutManager(4));
        ((t0) j()).f33311g.setAdapter(rUSyllableAdapter7);
        v(rUSyllableAdapter7);
        String str3 = this.V;
        Matcher matcher8 = e0.u(0, "\n", "compile(...)", str3, "input").matcher(str3);
        if (matcher8.find()) {
            ArrayList arrayList8 = new ArrayList(10);
            int iC8 = 0;
            do {
                iC8 = p.c(matcher8, str3, iC8, arrayList8);
            } while (matcher8.find());
            p.B(iC8, str3, arrayList8);
            listK8 = arrayList8;
        } else {
            listK8 = o.K(str3.toString());
        }
        if (!listK8.isEmpty()) {
            ListIterator listIterator8 = listK8.listIterator(listK8.size());
            while (true) {
                if (!listIterator8.hasPrevious()) {
                    listT8 = rVar;
                    break;
                } else if (((String) listIterator8.previous()).length() != 0) {
                    listT8 = e0.t(listIterator8, 1, listK8);
                    break;
                }
            }
        } else {
            listT8 = rVar;
            break;
        }
        String[] strArr8 = (String[]) listT8.toArray(new String[0]);
        RUSyllableAdapter1 rUSyllableAdapter8 = new RUSyllableAdapter1(o.L(Arrays.copyOf(strArr8, strArr8.length)), o.L("а", " ", "о", " "), o.L("лампа", " ", "космос", " "));
        ((t0) j()).f33312h.setLayoutManager(new GridLayoutManager(4));
        ((t0) j()).f33312h.setAdapter(rUSyllableAdapter8);
        v(rUSyllableAdapter8);
        String str4 = this.W;
        Matcher matcher9 = e0.u(0, "\n", "compile(...)", str4, "input").matcher(str4);
        if (matcher9.find()) {
            ArrayList arrayList9 = new ArrayList(10);
            int iC9 = 0;
            do {
                iC9 = p.c(matcher9, str4, iC9, arrayList9);
            } while (matcher9.find());
            p.B(iC9, str4, arrayList9);
            listK9 = arrayList9;
        } else {
            listK9 = o.K(str4.toString());
        }
        if (!listK9.isEmpty()) {
            ListIterator listIterator9 = listK9.listIterator(listK9.size());
            while (true) {
                if (!listIterator9.hasPrevious()) {
                    listT9 = rVar;
                    break;
                } else if (((String) listIterator9.previous()).length() != 0) {
                    listT9 = e0.t(listIterator9, 1, listK9);
                    break;
                }
            }
        } else {
            listT9 = rVar;
            break;
        }
        String[] strArr9 = (String[]) listT9.toArray(new String[0]);
        RUSyllableAdapter1 rUSyllableAdapter9 = new RUSyllableAdapter1(o.L(Arrays.copyOf(strArr9, strArr9.length)), o.L("е", " ", "я", " "), o.L("сестра", " ", "язык", " "));
        ((t0) j()).f33313i.setLayoutManager(new GridLayoutManager(4));
        ((t0) j()).f33313i.setAdapter(rUSyllableAdapter9);
        v(rUSyllableAdapter9);
        String str5 = this.X;
        Matcher matcher10 = e0.u(0, "\n", "compile(...)", str5, "input").matcher(str5);
        if (matcher10.find()) {
            ArrayList arrayList10 = new ArrayList(10);
            int iC10 = 0;
            do {
                iC10 = p.c(matcher10, str5, iC10, arrayList10);
            } while (matcher10.find());
            p.B(iC10, str5, arrayList10);
            listK10 = arrayList10;
        } else {
            listK10 = o.K(str5.toString());
        }
        if (!listK10.isEmpty()) {
            ListIterator listIterator10 = listK10.listIterator(listK10.size());
            while (true) {
                if (!listIterator10.hasPrevious()) {
                    listT10 = rVar;
                    break;
                } else if (((String) listIterator10.previous()).length() != 0) {
                    listT10 = e0.t(listIterator10, 1, listK10);
                    break;
                }
            }
        } else {
            listT10 = rVar;
            break;
        }
        String[] strArr10 = (String[]) listT10.toArray(new String[0]);
        RUSyllableAdapter1 rUSyllableAdapter10 = new RUSyllableAdapter1(o.L(Arrays.copyOf(strArr10, strArr10.length)), o.L("е", " ", "я", " "), o.L("море", " ", "дядя", " "));
        ((t0) j()).f33314j.setLayoutManager(new GridLayoutManager(4));
        ((t0) j()).f33314j.setAdapter(rUSyllableAdapter10);
        v(rUSyllableAdapter10);
        String strP3 = e.p(e.s("ши\n/шы/\nошибка (", getString(R.string.ru_alp_section_table_49), ")\nше\n/шэ/\nшеф (", getString(R.string.ru_alp_section_table_50), ")\nжи\n/ʒы/\nжизнь ("), getString(R.string.ru_alp_section_table_44), ")\nже\n/ʒэ/\nтоже (", getString(R.string.ru_alp_section_table_51), ")");
        Matcher matcher11 = e0.u(0, "\n", "compile(...)", strP3, "input").matcher(strP3);
        if (matcher11.find()) {
            ArrayList arrayList11 = new ArrayList(10);
            int iC11 = 0;
            do {
                iC11 = p.c(matcher11, strP3, iC11, arrayList11);
            } while (matcher11.find());
            p.B(iC11, strP3, arrayList11);
            listK11 = arrayList11;
        } else {
            listK11 = o.K(strP3.toString());
        }
        if (!listK11.isEmpty()) {
            ListIterator listIterator11 = listK11.listIterator(listK11.size());
            while (true) {
                if (!listIterator11.hasPrevious()) {
                    listT11 = rVar;
                    break;
                } else if (((String) listIterator11.previous()).length() != 0) {
                    listT11 = e0.t(listIterator11, 1, listK11);
                    break;
                }
            }
        } else {
            listT11 = rVar;
            break;
        }
        String[] strArr11 = (String[]) listT11.toArray(new String[0]);
        RUSyllableAdapter1 rUSyllableAdapter11 = new RUSyllableAdapter1(o.L(Arrays.copyOf(strArr11, strArr11.length)), o.L(" ", " ", "ши", " ", " ", "ше", " ", " ", "жи", " ", " ", "же"), o.L("ши", " ", "ошибка", "ше", " ", "шеф", "жи", " ", "жизнь", "же", " ", "тоже"));
        ((t0) j()).f33315k.setLayoutManager(new GridLayoutManager(3));
        ((t0) j()).f33315k.setAdapter(rUSyllableAdapter11);
        v(rUSyllableAdapter11);
        File file = new File(e.m(xt.b.a().b(), fv.b.D(-1L)));
        fv.a aVar = new fv.a(0L, fv.b.E(-1L), fv.b.D(-1L));
        if (!file.exists()) {
            e3 e3Var = ((t0) j()).f33306b;
            LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
            ComposeView composeView = (ComposeView) e3Var.f32524c;
            ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
            linearLayout.setVisibility(0);
            this.P.d(aVar, new aj.e(this, 2));
            return;
        }
        yx.d dVarM = new yx.a(new bo.c(file, 0), 0).M(ky.e.f38937b);
        qx.o oVarA = px.b.a();
        xx.d dVar = new xx.d(vx.b.f54316e, new bo.b(this));
        try {
            dVarM.K(new yx.b(dVar, oVarA));
            j.a(dVar, this.f36391f);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
        }
    }

    public final void u(String status, boolean z11) {
        m.f(status, "status");
        e3 e3Var = ((t0) j()).f33306b;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (z11) {
            linearLayout.setVisibility(8);
            return;
        }
        ComposeView composeView = (ComposeView) e3Var.f32524c;
        ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
        linearLayout.setVisibility(0);
    }

    public final void v(RUSyllableAdapter1 rUSyllableAdapter1) {
        rUSyllableAdapter1.setOnItemChildClickListener(new bo.b(this));
    }
}
