package com.lingo.lingoskill.base.refill;

import android.text.TextUtils;
import com.google.api.Service;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.lingo.lingoskill.object.Ack;
import com.lingo.lingoskill.object.HwCharGroup;
import com.lingo.lingoskill.object.HwCharPart;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.HwTCharPart;
import com.lingo.lingoskill.object.JPChar;
import com.lingo.lingoskill.object.JPCharPart;
import com.lingo.lingoskill.object.LDCharacter;
import com.lingo.lingoskill.object.Lesson;
import com.lingo.lingoskill.object.Level;
import com.lingo.lingoskill.object.Model_Sentence_000;
import com.lingo.lingoskill.object.Model_Sentence_010;
import com.lingo.lingoskill.object.Model_Sentence_020;
import com.lingo.lingoskill.object.Model_Sentence_030;
import com.lingo.lingoskill.object.Model_Sentence_040;
import com.lingo.lingoskill.object.Model_Sentence_050;
import com.lingo.lingoskill.object.Phrase;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import o20.t0;
import org.json.JSONException;
import org.json.JSONObject;
import oz.q;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements tx.c, tx.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f21703b = new g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f21705c = new g(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f21707d = new g(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f21709e = new g(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f21711f = new g(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f21714t = new g(5);
    public static final g H = new g(6);
    public static final g K = new g(7);
    public static final g L = new g(8);
    public static final g M = new g(9);
    public static final g N = new g(10);
    public static final g O = new g(11);
    public static final g P = new g(12);
    public static final g Q = new g(13);
    public static final g R = new g(14);
    public static final g S = new g(15);
    public static final g T = new g(16);
    public static final g U = new g(17);
    public static final g V = new g(18);
    public static final g W = new g(19);
    public static final g X = new g(20);
    public static final g Y = new g(21);
    public static final g Z = new g(22);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final g f21702a0 = new g(23);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final g f21704b0 = new g(24);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final g f21706c0 = new g(25);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final g f21708d0 = new g(26);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final g f21710e0 = new g(27);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final g f21712f0 = new g(28);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final g f21713g0 = new g(29);

    public /* synthetic */ g(int i11) {
        this.f21715a = i11;
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f21715a) {
            case 0:
                Throwable p4 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p4, "p0");
                p4.printStackTrace();
                break;
            case 1:
                Throwable p11 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p11, "p0");
                p11.printStackTrace();
                break;
            case 2:
                Throwable p12 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p12, "p0");
                p12.printStackTrace();
                break;
            case 3:
                Throwable p13 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p13, "p0");
                p13.printStackTrace();
                break;
            case 4:
                Throwable p14 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p14, "p0");
                p14.printStackTrace();
                break;
            case 5:
                Throwable p15 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p15, "p0");
                p15.printStackTrace();
                break;
            case 6:
                Throwable p16 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p16, "p0");
                p16.printStackTrace();
                break;
            case 7:
                Throwable p17 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p17, "p0");
                p17.printStackTrace();
                break;
            case 8:
                Throwable p18 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p18, "p0");
                p18.printStackTrace();
                break;
            case 9:
                Throwable p19 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p19, "p0");
                p19.printStackTrace();
                break;
            case 10:
                Throwable p21 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p21, "p0");
                p21.printStackTrace();
                break;
            case 11:
                Throwable p22 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p22, "p0");
                p22.printStackTrace();
                break;
            default:
                Throwable p23 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p23, "p0");
                p23.printStackTrace();
                break;
        }
    }

    @Override // tx.d
    public Object apply(Object obj) throws JSONException {
        switch (this.f21715a) {
            case 13:
                t0 t0Var = (t0) obj;
                ArrayList arrayListN = com.google.android.material.datepicker.d.n(t0Var, "s");
                JSONObject jSONObject = new JSONObject((String) t0Var.f44599b);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(itKeys.next());
                    try {
                        arrayListN.add((Ack) new Gson().fromJson(jSONObject2.toString(), Ack.class));
                    } catch (JsonSyntaxException e8) {
                        jSONObject2.toString();
                        e8.printStackTrace();
                    }
                }
                return arrayListN;
            case 14:
                t0 t0Var2 = (t0) obj;
                ArrayList arrayListN2 = com.google.android.material.datepicker.d.n(t0Var2, "s");
                String str = (String) t0Var2.f44599b;
                JSONObject jSONObject3 = new JSONObject(str != null ? x.q0(str, "CharId", "id") : BuildConfig.VERSION_NAME);
                Iterator<String> itKeys2 = jSONObject3.keys();
                while (itKeys2.hasNext()) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject(itKeys2.next());
                    try {
                        arrayListN2.add((JPChar) new Gson().fromJson(jSONObject4.toString(), JPChar.class));
                    } catch (JsonSyntaxException e10) {
                        jSONObject4.toString();
                        e10.printStackTrace();
                    }
                }
                return arrayListN2;
            case 15:
                t0 t0Var3 = (t0) obj;
                ArrayList arrayListN3 = com.google.android.material.datepicker.d.n(t0Var3, "s");
                JSONObject jSONObject5 = new JSONObject((String) t0Var3.f44599b);
                Iterator<String> itKeys3 = jSONObject5.keys();
                while (itKeys3.hasNext()) {
                    JSONObject jSONObject6 = jSONObject5.getJSONObject(itKeys3.next());
                    try {
                        arrayListN3.add((JPCharPart) new Gson().fromJson(jSONObject6.toString(), JPCharPart.class));
                    } catch (JsonSyntaxException e11) {
                        jSONObject6.toString();
                        e11.printStackTrace();
                    }
                }
                return arrayListN3;
            case 16:
                t0 s3 = (t0) obj;
                kotlin.jvm.internal.m.f(s3, "s");
                Object obj2 = s3.f44599b;
                kotlin.jvm.internal.m.c(obj2);
                String strConcat = (String) obj2;
                if (x.k0(strConcat, "},}", false)) {
                    String strSubstring = strConcat.substring(0, q.M0(6, (CharSequence) obj2, "},}"));
                    kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("}}");
                }
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject7 = new JSONObject(strConcat);
                Iterator<String> itKeys4 = jSONObject7.keys();
                while (itKeys4.hasNext()) {
                    JSONObject jSONObject8 = jSONObject7.getJSONObject(itKeys4.next());
                    try {
                        arrayList.add((HwCharacter) new Gson().fromJson(jSONObject8.toString(), HwCharacter.class));
                    } catch (JsonSyntaxException e12) {
                        jSONObject8.toString();
                        e12.printStackTrace();
                    }
                }
                return arrayList;
            case 17:
                t0 s11 = (t0) obj;
                kotlin.jvm.internal.m.f(s11, "s");
                Object obj3 = s11.f44599b;
                kotlin.jvm.internal.m.c(obj3);
                String strConcat2 = (String) obj3;
                if (x.k0(strConcat2, "},}", false)) {
                    String strSubstring2 = strConcat2.substring(0, q.M0(6, (CharSequence) obj3, "},}"));
                    kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                    strConcat2 = strSubstring2.concat("}}");
                }
                ArrayList arrayList2 = new ArrayList();
                JSONObject jSONObject9 = new JSONObject(strConcat2);
                Iterator<String> itKeys5 = jSONObject9.keys();
                while (itKeys5.hasNext()) {
                    JSONObject jSONObject10 = jSONObject9.getJSONObject(itKeys5.next());
                    try {
                        arrayList2.add((HwCharGroup) new Gson().fromJson(jSONObject10.toString(), HwCharGroup.class));
                    } catch (JsonSyntaxException e13) {
                        jSONObject10.toString();
                        e13.printStackTrace();
                    }
                }
                return arrayList2;
            case 18:
                t0 t0Var4 = (t0) obj;
                ArrayList arrayListN4 = com.google.android.material.datepicker.d.n(t0Var4, "s");
                JSONObject jSONObject11 = new JSONObject((String) t0Var4.f44599b);
                Iterator<String> itKeys6 = jSONObject11.keys();
                while (itKeys6.hasNext()) {
                    JSONObject jSONObject12 = jSONObject11.getJSONObject(itKeys6.next());
                    try {
                        arrayListN4.add((HwCharPart) new Gson().fromJson(jSONObject12.toString(), HwCharPart.class));
                    } catch (JsonSyntaxException e14) {
                        jSONObject12.toString();
                        e14.printStackTrace();
                    }
                }
                return arrayListN4;
            case 19:
                t0 t0Var5 = (t0) obj;
                ArrayList arrayListN5 = com.google.android.material.datepicker.d.n(t0Var5, "s");
                JSONObject jSONObject13 = new JSONObject((String) t0Var5.f44599b);
                Iterator<String> itKeys7 = jSONObject13.keys();
                while (itKeys7.hasNext()) {
                    JSONObject jSONObject14 = jSONObject13.getJSONObject(itKeys7.next());
                    try {
                        arrayListN5.add((HwTCharPart) new Gson().fromJson(jSONObject14.toString(), HwTCharPart.class));
                    } catch (JsonSyntaxException e15) {
                        jSONObject14.toString();
                        e15.printStackTrace();
                    }
                }
                return arrayListN5;
            case 20:
                t0 t0Var6 = (t0) obj;
                ArrayList arrayListN6 = com.google.android.material.datepicker.d.n(t0Var6, "s");
                JSONObject jSONObject15 = new JSONObject((String) t0Var6.f44599b);
                Iterator<String> itKeys8 = jSONObject15.keys();
                while (itKeys8.hasNext()) {
                    JSONObject jSONObject16 = jSONObject15.getJSONObject(itKeys8.next());
                    try {
                        arrayListN6.add((LDCharacter) new Gson().fromJson(jSONObject16.toString(), LDCharacter.class));
                    } catch (JsonSyntaxException e16) {
                        jSONObject16.toString();
                        e16.printStackTrace();
                    }
                }
                return arrayListN6;
            case 21:
                t0 t0Var7 = (t0) obj;
                ArrayList arrayListN7 = com.google.android.material.datepicker.d.n(t0Var7, "s");
                JSONObject jSONObject17 = new JSONObject((String) t0Var7.f44599b);
                Iterator<String> itKeys9 = jSONObject17.keys();
                while (itKeys9.hasNext()) {
                    JSONObject jSONObject18 = jSONObject17.getJSONObject(itKeys9.next());
                    try {
                        arrayListN7.add((Lesson) new Gson().fromJson(jSONObject18.toString(), Lesson.class));
                    } catch (JsonSyntaxException e17) {
                        jSONObject18.toString();
                        e17.printStackTrace();
                    }
                }
                return arrayListN7;
            case 22:
                t0 t0Var8 = (t0) obj;
                ArrayList arrayListN8 = com.google.android.material.datepicker.d.n(t0Var8, "s");
                String str2 = (String) t0Var8.f44599b;
                JSONObject jSONObject19 = new JSONObject(str2 != null ? x.q0(str2, "},}", "}}") : null);
                Iterator<String> itKeys10 = jSONObject19.keys();
                while (itKeys10.hasNext()) {
                    JSONObject jSONObject20 = jSONObject19.getJSONObject(itKeys10.next());
                    try {
                        arrayListN8.add((Level) new Gson().fromJson(jSONObject20.toString(), Level.class));
                    } catch (JsonSyntaxException e18) {
                        jSONObject20.toString();
                        e18.printStackTrace();
                    }
                }
                return arrayListN8;
            case 23:
                t0 t0Var9 = (t0) obj;
                ArrayList arrayListN9 = com.google.android.material.datepicker.d.n(t0Var9, "s");
                JSONObject jSONObject21 = new JSONObject((String) t0Var9.f44599b);
                Iterator<String> itKeys11 = jSONObject21.keys();
                while (itKeys11.hasNext()) {
                    JSONObject jSONObject22 = jSONObject21.getJSONObject(itKeys11.next());
                    try {
                        arrayListN9.add((Phrase) new Gson().fromJson(jSONObject22.toString(), Phrase.class));
                    } catch (JsonSyntaxException e19) {
                        jSONObject22.toString();
                        e19.printStackTrace();
                    }
                }
                return arrayListN9;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                t0 t0Var10 = (t0) obj;
                ArrayList arrayListN10 = com.google.android.material.datepicker.d.n(t0Var10, "s");
                JSONObject jSONObject23 = new JSONObject((String) t0Var10.f44599b);
                Iterator<String> itKeys12 = jSONObject23.keys();
                while (itKeys12.hasNext()) {
                    JSONObject jSONObject24 = jSONObject23.getJSONObject(itKeys12.next());
                    try {
                        arrayListN10.add((Model_Sentence_000) new Gson().fromJson(jSONObject24.toString(), Model_Sentence_000.class));
                    } catch (JsonSyntaxException e21) {
                        jSONObject24.toString();
                        e21.printStackTrace();
                    }
                }
                return arrayListN10;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                t0 t0Var11 = (t0) obj;
                ArrayList arrayListN11 = com.google.android.material.datepicker.d.n(t0Var11, "s");
                JSONObject jSONObject25 = new JSONObject((String) t0Var11.f44599b);
                Iterator<String> itKeys13 = jSONObject25.keys();
                while (itKeys13.hasNext()) {
                    JSONObject jSONObject26 = jSONObject25.getJSONObject(itKeys13.next());
                    try {
                        Model_Sentence_010 model_Sentence_010 = (Model_Sentence_010) new Gson().fromJson(jSONObject26.toString(), Model_Sentence_010.class);
                        String options = model_Sentence_010.getOptions();
                        kotlin.jvm.internal.m.e(options, "getOptions(...)");
                        if (!TextUtils.isEmpty(q.i1(x.q0(options, " ", BuildConfig.VERSION_NAME)).toString())) {
                            arrayListN11.add(model_Sentence_010);
                        }
                    } catch (JsonSyntaxException e22) {
                        jSONObject26.toString();
                        e22.printStackTrace();
                    }
                }
                return arrayListN11;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                t0 t0Var12 = (t0) obj;
                ArrayList arrayListN12 = com.google.android.material.datepicker.d.n(t0Var12, "s");
                JSONObject jSONObject27 = new JSONObject((String) t0Var12.f44599b);
                Iterator<String> itKeys14 = jSONObject27.keys();
                while (itKeys14.hasNext()) {
                    JSONObject jSONObject28 = jSONObject27.getJSONObject(itKeys14.next());
                    try {
                        Model_Sentence_020 model_Sentence_020 = (Model_Sentence_020) new Gson().fromJson(jSONObject28.toString(), Model_Sentence_020.class);
                        String answer = model_Sentence_020.getAnswer();
                        kotlin.jvm.internal.m.e(answer, "getAnswer(...)");
                        if (!TextUtils.isEmpty(q.i1(x.q0(answer, " ", BuildConfig.VERSION_NAME)).toString())) {
                            arrayListN12.add(model_Sentence_020);
                        }
                    } catch (JsonSyntaxException e23) {
                        jSONObject28.toString();
                        e23.printStackTrace();
                    }
                }
                return arrayListN12;
            case 27:
                t0 t0Var13 = (t0) obj;
                ArrayList arrayListN13 = com.google.android.material.datepicker.d.n(t0Var13, "s");
                JSONObject jSONObject29 = new JSONObject((String) t0Var13.f44599b);
                Iterator<String> itKeys15 = jSONObject29.keys();
                while (itKeys15.hasNext()) {
                    JSONObject jSONObject30 = jSONObject29.getJSONObject(itKeys15.next());
                    try {
                        Model_Sentence_030 model_Sentence_030 = (Model_Sentence_030) new Gson().fromJson(jSONObject30.toString(), Model_Sentence_030.class);
                        String options2 = model_Sentence_030.getOptions();
                        kotlin.jvm.internal.m.e(options2, "getOptions(...)");
                        if (!TextUtils.isEmpty(q.i1(x.q0(options2, " ", BuildConfig.VERSION_NAME)).toString())) {
                            arrayListN13.add(model_Sentence_030);
                        }
                    } catch (JsonSyntaxException e24) {
                        jSONObject30.toString();
                        e24.printStackTrace();
                    }
                }
                return arrayListN13;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                t0 t0Var14 = (t0) obj;
                ArrayList arrayListN14 = com.google.android.material.datepicker.d.n(t0Var14, "s");
                JSONObject jSONObject31 = new JSONObject((String) t0Var14.f44599b);
                Iterator<String> itKeys16 = jSONObject31.keys();
                while (itKeys16.hasNext()) {
                    JSONObject jSONObject32 = jSONObject31.getJSONObject(itKeys16.next());
                    try {
                        Model_Sentence_040 model_Sentence_040 = (Model_Sentence_040) new Gson().fromJson(jSONObject32.toString(), Model_Sentence_040.class);
                        String options3 = model_Sentence_040.getOptions();
                        kotlin.jvm.internal.m.e(options3, "getOptions(...)");
                        if (!TextUtils.isEmpty(q.i1(x.q0(options3, " ", BuildConfig.VERSION_NAME)).toString())) {
                            arrayListN14.add(model_Sentence_040);
                        }
                    } catch (JsonSyntaxException e25) {
                        jSONObject32.toString();
                        e25.printStackTrace();
                    }
                }
                return arrayListN14;
            default:
                t0 t0Var15 = (t0) obj;
                ArrayList arrayListN15 = com.google.android.material.datepicker.d.n(t0Var15, "s");
                JSONObject jSONObject33 = new JSONObject((String) t0Var15.f44599b);
                Iterator<String> itKeys17 = jSONObject33.keys();
                while (itKeys17.hasNext()) {
                    JSONObject jSONObject34 = jSONObject33.getJSONObject(itKeys17.next());
                    try {
                        Model_Sentence_050 model_Sentence_050 = (Model_Sentence_050) new Gson().fromJson(jSONObject34.toString(), Model_Sentence_050.class);
                        String options4 = model_Sentence_050.getOptions();
                        kotlin.jvm.internal.m.e(options4, "getOptions(...)");
                        if (!TextUtils.isEmpty(q.i1(x.q0(options4, " ", BuildConfig.VERSION_NAME)).toString())) {
                            arrayListN15.add(model_Sentence_050);
                        }
                    } catch (JsonSyntaxException e26) {
                        jSONObject34.toString();
                        e26.printStackTrace();
                    }
                }
                return arrayListN15;
        }
    }
}
