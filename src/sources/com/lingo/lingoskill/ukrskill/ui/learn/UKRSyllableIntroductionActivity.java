package com.lingo.lingoskill.ukrskill.ui.learn;

import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import aq.b;
import bp.a0;
import bp.r;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import dl.h;
import ep.a;
import fr.j3;
import fz.c;
import h1.k7;
import h1.p7;
import h1.ua;
import j0.e2;
import j0.i1;
import j0.v1;
import j3.y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import mt.k6;
import oz.q;
import pr.y;
import qy.b0;
import se.i;
import tp.u;
import xg.d;
import xp.f;
import z1.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class UKRSyllableIntroductionActivity extends d {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f22066t = "A a\n[ukr-f-zy-a]\nБ б\n[ukr-f-zy-b]\nВ в\n[ukr-f-zy-v]\nГ г\n[ukr-f-zy-h]\nҐ ґ\n[ukr-f-zy-g]\nД д\n[ukr-f-zy-d]\nЕ е\n[ukr-f-zy-e]\nЄ є\n[ukr-f-zy-ie]\nЖ ж\n[ukr-f-zy-zh]\nЗ з\n[ukr-f-zy-z]\nИ и\n[ukr-f-zy-y]\nІ і\n[ukr-f-zy-i1]\nЇ ї\n[ukr-f-zy-yi]\nЙ й\n[ukr-f-zy-i2]\nК к\n[ukr-f-zy-k]\nЛ л\n[ukr-f-zy-l]\nМ м\n[ukr-f-zy-m]\nН н\n[ukr-f-zy-n]\nО о\n[ukr-f-zy-o]\nП п\n[ukr-f-zy-p]\nР р\n[ukr-f-zy-r]\nС с\n[ukr-f-zy-s]\nТ т\n[ukr-f-zy-t]\nУ у\n[ukr-f-zy-u]\nФ ф\n[ukr-f-zy-f]\nХ х\n[ukr-f-zy-kh]\nЦ ц\n[ukr-f-zy-ts]\nЧ ч\n[ukr-f-zy-ch]\nШ ш\n[ukr-f-zy-sh]\nЩ щ\n[ukr-f-zy-shch]\nЬ ь\n[ukr-f-zy-softsign]\nЮ ю\n[ukr-f-zy-iu]\nЯ я\n[ukr-f-zy-ia]";

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-918443289);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            x(null, sVar, i12 & 112);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(this, i11, 22, bundle);
        }
    }

    public final void p(b bVar, n nVar, int i11) {
        s sVar;
        String str;
        s sVar2;
        UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity = this;
        b bVar2 = bVar;
        s sVar3 = (s) nVar;
        sVar3.f0(2127171891);
        int i12 = i11 | (sVar3.h(bVar2) ? 4 : 2) | (sVar3.h(uKRSyllableIntroductionActivity) ? 32 : 16);
        if (sVar3.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar3.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                List listW0 = q.W0(uKRSyllableIntroductionActivity.f22066t, new String[]{"\n"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listW0) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                objQ = ry.m.g1(arrayList, 2, 2);
                sVar3.o0(objQ);
            }
            List list = (List) objQ;
            Object objQ2 = sVar3.Q();
            if (objQ2 == gVar) {
                String string = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_14);
                String string2 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_15);
                String string3 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_16);
                String string4 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_17);
                String string5 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_18);
                String string6 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_19);
                String string7 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_20);
                String string8 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_21);
                String string9 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_22);
                str = "\n";
                String string10 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_23);
                StringBuilder sbS = e.s("A a\na\n[ukr-f-zy-a0]\nАнна / Anna\n", string, "\n[ukr-f-zy-anna]\nЕ е\ne\n[ukr-f-zy-e0]\nсестра / sestra\n", string2, "\n[ukr-f-zy-sestra]\nЄ є\nie\n[ukr-f-zy-ie0]\nєвро / yevro\n");
                com.google.android.material.datepicker.d.w(sbS, string3, "\n[ukr-f-zy-euro]\nИ и\ny\n[ukr-f-zy-y0]\nви / vy\n", string4, "\n[ukr-f-zy-vy]\nІ і\ni\n[ukr-f-zy-i0]\nпіца / pitsa\n");
                com.google.android.material.datepicker.d.w(sbS, string5, "\n[ukr-f-zy-pitsa]\nЇ ї\nyi\n[ukr-f-zy-ji0]\nїсти / yisty\n", string6, "\n[ukr-f-zy-yisty]\nО о\no\n[ukr-f-zy-o0]\nодин / odyn\n");
                com.google.android.material.datepicker.d.w(sbS, string7, "\n[ukr-f-zy-odyn]\nУ у\nu\n[ukr-f-zy-u0]\nУкраїна / Ukraina\n", string8, "\n[ukr-f-zy-ukrayina]\nЮ ю\nju\n[ukr-f-zy-ju0]\nЮлія / Yuliia\n");
                List listW1 = q.W0(e.p(sbS, string9, "\n[ukr-f-zy-julia]\nЯ я\njɑ\n[ukr-f-zy-ja0]\nЯна / Yana\n", string10, "\n[ukr-f-zy-yana]\n\n"), new String[]{str}, 0, 6);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listW1) {
                    if (((String) obj2).length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                objQ2 = ry.m.g1(arrayList2, 6, 6);
                sVar3.o0(objQ2);
            } else {
                str = "\n";
            }
            List list2 = (List) objQ2;
            Object objQ3 = sVar3.Q();
            if (objQ3 == gVar) {
                String string11 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_24);
                String string12 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_25);
                String string13 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_26);
                String string14 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_27);
                String string15 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_28);
                String string16 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_29);
                String string17 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_30);
                String string18 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_31);
                String string19 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_32);
                String string20 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_33);
                String string21 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_34);
                String string22 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_35);
                String string23 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_36);
                String string24 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_37);
                String string25 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_38);
                String string26 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_39);
                String string27 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_40);
                String string28 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_41);
                String string29 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_42);
                String string30 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_43);
                String string31 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_44);
                String string32 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_45);
                StringBuilder sbS2 = e.s("Б б\nb\n[ukr-f-zy-b1]\nборщ / borshch\n", string11, "\n[ukr-f-zy-borshch]\nВ в\nv\n[ukr-f-zy-w1v1]\nвона / vona\n", string12, "\n[ukr-f-zy-vona]\nГ г\nh\n[ukr-f-zy-h1]\nготель / hotel\n");
                com.google.android.material.datepicker.d.w(sbS2, string13, "\n[ukr-f-zy-hotel]\nҐ ґ\nɡ\n[ukr-f-zy-g1]\nґава / gava\n", string14, "\n[ukr-f-zy-gava]\nД д\nd\n[ukr-f-zy-d1]\nдобре / dobre\n");
                com.google.android.material.datepicker.d.w(sbS2, string15, "\n[ukr-f-zy-dobre]\nЖ ж\nʒ\n[ukr-f-zy-zh1]\nжурнал / zhurnal\n", string16, "\n[ukr-f-zy-zhurnal]\nЗ з\nz\n[ukr-f-zy-z1]\nзавтра / zavtra\n");
                com.google.android.material.datepicker.d.w(sbS2, string17, "\n[ukr-f-zy-zavtra]\nЙ й\nshort i\n[ukr-f-zy-j0]\nвайфай / vaifai\n", string18, "\n[ukr-f-zy-vaifai]\nК к\nk\n[ukr-f-zy-k1]\nКиїв / Kyiv\n");
                com.google.android.material.datepicker.d.w(sbS2, string19, "\n[ukr-f-zy-kyiv]\nЛ л\nl\n[ukr-f-zy-l1]\nале / ale\n", string20, "\n[ukr-f-zy-ale]\nМ м\nm\n[ukr-f-zy-m1]\nмама / mama\n");
                com.google.android.material.datepicker.d.w(sbS2, string21, "\n[ukr-f-zy-mama]\nН н\nn\n[ukr-f-zy-n1]\nне / ne\n", string22, "\n[ukr-f-zy-ne]\nП п\np\n[ukr-f-zy-p1]\nподруга / podruha\n");
                com.google.android.material.datepicker.d.w(sbS2, string23, "\n[ukr-f-zy-podruha]\nР р\nrolled r\n[ukr-f-zy-r1]\nрис / rys\n", string24, "\n[ukr-f-zy-rys]\nС с\ns\n[ukr-f-zy-s1]\nсуп / sup\n");
                com.google.android.material.datepicker.d.w(sbS2, string25, "\n[ukr-f-zy-sup]\nТ т\nt\n[ukr-f-zy-t1]\nтак / tak\n", string26, "\n[ukr-f-zy-tak]\nФ ф\nf\n[ukr-f-zy-f1]\nкафе / kafe\n");
                com.google.android.material.datepicker.d.w(sbS2, string27, "\n[ukr-f-zy-kafe]\nХ х\nkh\n[ukr-f-zy-kh1]\nхочу / khochu\n", string28, "\n[ukr-f-zy-khochu]\nЦ ц\nts\n[ukr-f-zy-ts1]\nце / tse\n");
                com.google.android.material.datepicker.d.w(sbS2, string29, "\n[ukr-f-zy-tse]\nЧ ч\nch\n[ukr-f-zy-ch1]\nчай / chai\n", string30, "\n[ukr-f-zy-chai]\nШ ш\nsh\n[ukr-f-zy-sh1]\nшоколад / shokolad\n");
                List listW2 = q.W0(e.p(sbS2, string31, "\n[ukr-f-zy-shokolad]\nЩ щ\nshch\n[ukr-f-zy-shch1]\nщо / shcho\n", string32, "\n[ukr-f-zy-shcho]\n\n"), new String[]{str}, 0, 6);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listW2) {
                    if (((String) obj3).length() > 0) {
                        arrayList3.add(obj3);
                    }
                }
                objQ3 = ry.m.g1(arrayList3, 6, 6);
                sVar2 = sVar3;
                sVar2.o0(objQ3);
            } else {
                sVar2 = sVar3;
            }
            List list3 = (List) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                uKRSyllableIntroductionActivity = this;
                String string33 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_46);
                String string34 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_47);
                String string35 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_48);
                String string36 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_49);
                String string37 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_50);
                StringBuilder sbS3 = e.s("віза / viza\nvisa\n[ukr-f-zy-viza]\nмазь / maz\n", string33, "\n[ukr-f-zy-maz]\nкола / kola\n", string34, "\n[ukr-f-zy-kola]\nроль / rol\n");
                com.google.android.material.datepicker.d.w(sbS3, string35, "\n[ukr-f-zy-rol]\nАнна / Anna\n", string36, "\n[ukr-f-zy-anna]\nдень / den\n");
                List listW3 = q.W0(a.k(sbS3, string37, "\n[ukr-f-zy-den]\n\n"), new String[]{str}, 0, 6);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : listW3) {
                    if (((String) obj4).length() > 0) {
                        arrayList4.add(obj4);
                    }
                }
                objQ4 = ry.m.g1(arrayList4, 6, 6);
                sVar2.o0(objQ4);
            } else {
                uKRSyllableIntroductionActivity = this;
            }
            List list4 = (List) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                String string38 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_51);
                String string39 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_52);
                String string40 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_53);
                String string41 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_54);
                String string42 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_55);
                String string43 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_56);
                String string44 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_57);
                String string45 = uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_58);
                StringBuilder sbS4 = e.s("омлет / omlet\n", string38, "\n[ukr-f-zy-omlet]\nллє / llie\n", string39, "\n[ukr-f-zy-llie]\nви / vy\n");
                com.google.android.material.datepicker.d.w(sbS4, string40, "\n[ukr-f-zy-vy]\nвіза / viza\n", string41, "\n[ukr-f-zy-viza]\nлуг / luh \n");
                com.google.android.material.datepicker.d.w(sbS4, string42, "\n[ukr-f-zy-lug]\nлюбов / liubov\n", string43, "\n[ukr-f-zy-liubov]\nхата / khata\n");
                List listW4 = q.W0(e.p(sbS4, string44, "\n[ukr-f-zy-khata]\nдитя / dytia\n", string45, "\n[ukr-f-zy-dytia]\n\n"), new String[]{str}, 0, 6);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : listW4) {
                    if (((String) obj5).length() > 0) {
                        arrayList5.add(obj5);
                    }
                }
                objQ5 = ry.m.g1(arrayList5, 6, 6);
                sVar2.o0(objQ5);
            }
            List list5 = (List) objQ5;
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                List listW5 = q.W0(e.p(e.s("ім'я / imia\n", uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_59), "\n[ukr-f-zy-imia]\nм'ясо / miaso\n", uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_60), "\n[ukr-f-zy-miaso]\nп'ять / piat\n"), uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_61), "\n[ukr-f-zy-piat]\nкомп'ютер / kompiuter\n", uKRSyllableIntroductionActivity.getString(R.string.ukr_alp_section_content_62), "\n[ukr-f-zy-kompiuter]\n\n"), new String[]{str}, 0, 6);
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : listW5) {
                    if (((String) obj6).length() > 0) {
                        arrayList6.add(obj6);
                    }
                }
                objQ6 = ry.m.g1(arrayList6, 3, 3);
                sVar2.o0(objQ6);
            }
            List list6 = (List) objQ6;
            m0.b bVar3 = new m0.b(5);
            float f5 = 16;
            v1 v1Var = new v1(f5, f5, f5, 32);
            boolean zH = sVar2.h(uKRSyllableIntroductionActivity) | sVar2.h(list) | sVar2.h(bVar) | sVar2.h(list2) | sVar2.h(list3) | sVar2.h(list4) | sVar2.h(list5) | sVar2.h(list6);
            Object objQ7 = sVar2.Q();
            if (zH || objQ7 == gVar) {
                bVar2 = bVar;
                r rVar = new r(list, uKRSyllableIntroductionActivity, bVar2, list2, list3, list4, list5, list6, 4);
                sVar2.o0(rVar);
                objQ7 = rVar;
            } else {
                bVar2 = bVar;
            }
            sVar = sVar2;
            md.a.a(bVar3, null, null, v1Var, null, null, null, false, null, (c) objQ7, sVar, 0, 1014);
        } else {
            sVar = sVar3;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new xp.d(uKRSyllableIntroductionActivity, bVar2, i11, 1);
        }
    }

    public final void q(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(574077670);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.E(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.second_black), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f(this, str, i11, 2);
        }
    }

    public final void r(String str, String str2, fz.a aVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(881813764);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 131) != 130)) {
            k7.d(j0.c.j(e2.e(j0.c.A(o.f58481a, 1), 1.0f), 1.0f), r0.f.d(4), k7.p(i.k(sVar, R.color.white), sVar, 0), k7.q(62, 0), null, t1.e.d(-1540862254, new h(aVar, str, 4), sVar), sVar, 196614, 16);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new xp.i(this, str, str2, aVar, i11, 0);
        }
    }

    public final void s(String str, String str2, fz.a aVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(241395417);
        int i12 = (sVar.f(str) ? 32 : 16) | i11 | (sVar.f(str2) ? 256 : 128) | (sVar.h(aVar) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            z1.r rVarA = j0.c.A(o.f58481a, 1);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            float f5 = 0;
            k7.d(e2.g(rVarA.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 72), r0.f.d(f5), k7.p(i.k(sVar, R.color.white), sVar, 0), k7.s(f5), null, t1.e.d(-392754137, new dl.g(aVar, str, str2, 3), sVar), sVar, 196608, 16);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new xp.i(this, str, str2, aVar, i11, 1);
        }
    }

    public final void t(final List list, final List list2, final float f5, final c cVar, n nVar, final int i11) {
        s sVar = (s) nVar;
        sVar.f0(298217908);
        int i12 = (sVar.h(list) ? 32 : 16) | i11 | (sVar.h(list2) ? 256 : 128) | (sVar.h(cVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            z1.r rVarA = j0.c.A(o.f58481a, 1);
            if (f5 <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            float f11 = 0;
            k7.d(e2.g(rVarA.i(new i1(f5 <= Float.MAX_VALUE ? f5 : Float.MAX_VALUE, true)), 72), r0.f.d(f11), k7.p(i.k(sVar, R.color.white), sVar, 0), k7.s(f11), null, t1.e.d(1909989798, new xn.d(cVar, list, list2, 1), sVar), sVar, 196608, 16);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(list, list2, f5, cVar, i11) { // from class: xp.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ List f56165b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List f56166c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f56167d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ fz.c f56168e;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    n nVar2 = (n) obj;
                    ((Integer) obj2).getClass();
                    int i13 = UKRSyllableIntroductionActivity.H;
                    this.f56164a.t(this.f56165b, this.f56166c, this.f56167d, this.f56168e, nVar2, t.M(3079));
                    return b0.f48488a;
                }
            };
        }
    }

    public final void u(int i11, String str, n nVar, z1.r rVar) {
        s sVar = (s) nVar;
        sVar.f0(-796189906);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.f(rVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            float f5 = 0;
            k7.d(rVar, r0.f.d(f5), k7.p(i.k(sVar, R.color.colorAccent), sVar, 0), k7.s(f5), null, t1.e.d(-1121249284, new a0(str, 15), sVar), sVar, ((i12 >> 3) & 14) | 196608, 16);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(this, str, rVar, i11, 24);
        }
    }

    public final void v(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-188728859);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.C(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, 1), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.primary_black), j3.A(16), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f(this, str, i11, 1);
        }
    }

    public final void w(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-1748650357);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.E(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.primary_black), j3.A(18), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f(this, str, i11, 0);
        }
    }

    public final void x(b bVar, n nVar, int i11) {
        b bVar2;
        b bVar3;
        b bVar4;
        s sVar = (s) nVar;
        sVar.f0(1036612769);
        int i12 = i11 | 2 | (sVar.h(this) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                bVar3 = (b) ViewModelKt.viewModel(z.a(b.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, sVar, 0, 0);
            } else {
                sVar.W();
                bVar3 = bVar;
            }
            sVar.q();
            b1 b1VarO = t.o(bVar3.f2829b, sVar);
            if (((Number) b1VarO.getValue()).floatValue() < 1.0f) {
                sVar.d0(916404371);
                tv.a.g(((Number) b1VarO.getValue()).floatValue(), null, sVar, 0, 6);
                sVar.p(false);
                bVar4 = bVar3;
            } else {
                sVar.d0(916507446);
                bVar4 = bVar3;
                p7.a(null, t1.e.d(-1234209783, new xp.c(this, 0), sVar), null, null, null, 0, 0L, 0L, null, t1.e.d(-1054116396, new u(3, this, bVar3), sVar), sVar, 805306416, 509);
                sVar.p(false);
            }
            bVar2 = bVar4;
        } else {
            sVar.W();
            bVar2 = bVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new xp.d(this, bVar2, i11, 0);
        }
    }
}
