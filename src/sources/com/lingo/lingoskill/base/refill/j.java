package com.lingo.lingoskill.base.refill;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.lingo.lingoskill.object.Model_Sentence_060;
import com.lingo.lingoskill.object.Model_Sentence_070;
import com.lingo.lingoskill.object.Model_Sentence_080;
import com.lingo.lingoskill.object.Model_Sentence_090;
import com.lingo.lingoskill.object.Model_Sentence_100;
import com.lingo.lingoskill.object.Model_Sentence_QA;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.TravelCategory;
import com.lingo.lingoskill.object.TravelPhrase;
import com.lingo.lingoskill.object.Unit;
import com.lingo.lingoskill.object.Word;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import nv.p;
import o20.t0;
import org.json.JSONException;
import org.json.JSONObject;
import oz.q;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements tx.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f21724b = new j(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f21725c = new j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f21726d = new j(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f21727e = new j(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f21728f = new j(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f21729t = new j(5);
    public static final j H = new j(6);
    public static final j K = new j(7);
    public static final j L = new j(8);
    public static final j M = new j(9);
    public static final j N = new j(10);
    public static final j O = new j(11);

    public /* synthetic */ j(int i11) {
        this.f21730a = i11;
    }

    @Override // tx.d
    public final Object apply(Object obj) throws JSONException {
        switch (this.f21730a) {
            case 0:
                t0 t0Var = (t0) obj;
                ArrayList arrayListN = com.google.android.material.datepicker.d.n(t0Var, "s");
                JSONObject jSONObject = new JSONObject((String) t0Var.f44599b);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(itKeys.next());
                    try {
                        Model_Sentence_060 model_Sentence_060 = (Model_Sentence_060) new Gson().fromJson(jSONObject2.toString(), Model_Sentence_060.class);
                        String options = model_Sentence_060.getOptions();
                        kotlin.jvm.internal.m.e(options, "getOptions(...)");
                        if (!TextUtils.isEmpty(q.i1(x.q0(options, " ", BuildConfig.VERSION_NAME)).toString())) {
                            arrayListN.add(model_Sentence_060);
                        }
                    } catch (JsonSyntaxException e8) {
                        jSONObject2.toString();
                        e8.printStackTrace();
                    }
                }
                return arrayListN;
            case 1:
                t0 t0Var2 = (t0) obj;
                ArrayList arrayListN2 = com.google.android.material.datepicker.d.n(t0Var2, "s");
                JSONObject jSONObject3 = new JSONObject((String) t0Var2.f44599b);
                Iterator<String> itKeys2 = jSONObject3.keys();
                while (itKeys2.hasNext()) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject(itKeys2.next());
                    try {
                        Model_Sentence_070 model_Sentence_070 = (Model_Sentence_070) new Gson().fromJson(jSONObject4.toString(), Model_Sentence_070.class);
                        String options2 = model_Sentence_070.getOptions();
                        kotlin.jvm.internal.m.e(options2, "getOptions(...)");
                        if (!TextUtils.isEmpty(q.i1(x.q0(options2, " ", BuildConfig.VERSION_NAME)).toString())) {
                            arrayListN2.add(model_Sentence_070);
                        }
                    } catch (JsonSyntaxException e10) {
                        jSONObject4.toString();
                        e10.printStackTrace();
                    }
                }
                return arrayListN2;
            case 2:
                t0 t0Var3 = (t0) obj;
                ArrayList arrayListN3 = com.google.android.material.datepicker.d.n(t0Var3, "s");
                JSONObject jSONObject5 = new JSONObject((String) t0Var3.f44599b);
                Iterator<String> itKeys3 = jSONObject5.keys();
                while (itKeys3.hasNext()) {
                    JSONObject jSONObject6 = jSONObject5.getJSONObject(itKeys3.next());
                    try {
                        Model_Sentence_080 model_Sentence_080 = (Model_Sentence_080) new Gson().fromJson(jSONObject6.toString(), Model_Sentence_080.class);
                        String options3 = model_Sentence_080.getOptions();
                        kotlin.jvm.internal.m.e(options3, "getOptions(...)");
                        if (!TextUtils.isEmpty(q.i1(x.q0(options3, " ", BuildConfig.VERSION_NAME)).toString())) {
                            arrayListN3.add(model_Sentence_080);
                        }
                    } catch (JsonSyntaxException e11) {
                        jSONObject6.toString();
                        e11.printStackTrace();
                    }
                }
                return arrayListN3;
            case 3:
                t0 t0Var4 = (t0) obj;
                ArrayList arrayListN4 = com.google.android.material.datepicker.d.n(t0Var4, "s");
                JSONObject jSONObject7 = new JSONObject((String) t0Var4.f44599b);
                Iterator<String> itKeys4 = jSONObject7.keys();
                while (itKeys4.hasNext()) {
                    JSONObject jSONObject8 = jSONObject7.getJSONObject(itKeys4.next());
                    try {
                        Model_Sentence_090 model_Sentence_090 = (Model_Sentence_090) new Gson().fromJson(jSONObject8.toString(), Model_Sentence_090.class);
                        String options4 = model_Sentence_090.getOptions();
                        kotlin.jvm.internal.m.e(options4, "getOptions(...)");
                        if (!TextUtils.isEmpty(q.i1(x.q0(options4, " ", BuildConfig.VERSION_NAME)).toString())) {
                            arrayListN4.add(model_Sentence_090);
                        }
                    } catch (JsonSyntaxException e12) {
                        jSONObject8.toString();
                        e12.printStackTrace();
                    }
                }
                return arrayListN4;
            case 4:
                t0 t0Var5 = (t0) obj;
                ArrayList arrayListN5 = com.google.android.material.datepicker.d.n(t0Var5, "s");
                JSONObject jSONObject9 = new JSONObject((String) t0Var5.f44599b);
                Iterator<String> itKeys5 = jSONObject9.keys();
                while (itKeys5.hasNext()) {
                    JSONObject jSONObject10 = jSONObject9.getJSONObject(itKeys5.next());
                    try {
                        Model_Sentence_100 model_Sentence_100 = (Model_Sentence_100) new Gson().fromJson(jSONObject10.toString(), Model_Sentence_100.class);
                        String options5 = model_Sentence_100.getOptions();
                        kotlin.jvm.internal.m.e(options5, "getOptions(...)");
                        if (!TextUtils.isEmpty(q.i1(x.q0(options5, " ", BuildConfig.VERSION_NAME)).toString())) {
                            arrayListN5.add(model_Sentence_100);
                        }
                    } catch (JsonSyntaxException e13) {
                        jSONObject10.toString();
                        e13.printStackTrace();
                    }
                }
                return arrayListN5;
            case 5:
                t0 t0Var6 = (t0) obj;
                ArrayList arrayListN6 = com.google.android.material.datepicker.d.n(t0Var6, "s");
                JSONObject jSONObject11 = new JSONObject((String) t0Var6.f44599b);
                Iterator<String> itKeys6 = jSONObject11.keys();
                while (itKeys6.hasNext()) {
                    JSONObject jSONObject12 = jSONObject11.getJSONObject(itKeys6.next());
                    try {
                        arrayListN6.add((Model_Sentence_QA) new Gson().fromJson(jSONObject12.toString(), Model_Sentence_QA.class));
                    } catch (JsonSyntaxException e14) {
                        jSONObject12.toString();
                        e14.printStackTrace();
                    }
                }
                return arrayListN6;
            case 6:
                t0 t0Var7 = (t0) obj;
                ArrayList arrayListN7 = com.google.android.material.datepicker.d.n(t0Var7, "s");
                JSONObject jSONObject13 = new JSONObject((String) t0Var7.f44599b);
                Iterator<String> itKeys7 = jSONObject13.keys();
                while (itKeys7.hasNext()) {
                    JSONObject jSONObject14 = jSONObject13.getJSONObject(itKeys7.next());
                    try {
                        arrayListN7.add((Sentence) new Gson().fromJson(jSONObject14.toString(), Sentence.class));
                    } catch (JsonSyntaxException e15) {
                        jSONObject14.toString();
                        e15.printStackTrace();
                    }
                }
                return arrayListN7;
            case 7:
                t0 t0Var8 = (t0) obj;
                ArrayList arrayListN8 = com.google.android.material.datepicker.d.n(t0Var8, "s");
                JSONObject jSONObject15 = new JSONObject((String) t0Var8.f44599b);
                Iterator<String> itKeys8 = jSONObject15.keys();
                while (itKeys8.hasNext()) {
                    JSONObject jSONObject16 = jSONObject15.getJSONObject(itKeys8.next());
                    try {
                        arrayListN8.add((TravelCategory) new Gson().fromJson(jSONObject16.toString(), TravelCategory.class));
                    } catch (JsonSyntaxException e16) {
                        jSONObject16.toString();
                        e16.printStackTrace();
                    }
                }
                return arrayListN8;
            case 8:
                t0 t0Var9 = (t0) obj;
                ArrayList arrayListN9 = com.google.android.material.datepicker.d.n(t0Var9, "s");
                JSONObject jSONObject17 = new JSONObject((String) t0Var9.f44599b);
                Iterator<String> itKeys9 = jSONObject17.keys();
                while (itKeys9.hasNext()) {
                    String next = itKeys9.next();
                    JSONObject jSONObject18 = jSONObject17.getJSONObject(next);
                    try {
                        TravelPhrase travelPhrase = (TravelPhrase) new Gson().fromJson(jSONObject18.toString(), TravelPhrase.class);
                        kotlin.jvm.internal.m.c(next);
                        travelPhrase.setID(Long.parseLong(next));
                        arrayListN9.add(travelPhrase);
                    } catch (JsonSyntaxException e17) {
                        jSONObject18.toString();
                        e17.printStackTrace();
                    }
                }
                return arrayListN9;
            case 9:
                t0 t0Var10 = (t0) obj;
                ArrayList arrayListN10 = com.google.android.material.datepicker.d.n(t0Var10, "s");
                Object obj2 = t0Var10.f44599b;
                kotlin.jvm.internal.m.c(obj2);
                Pattern patternCompile = Pattern.compile("\\\\\"");
                kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                String strReplaceAll = patternCompile.matcher((CharSequence) obj2).replaceAll("'");
                kotlin.jvm.internal.m.e(strReplaceAll, "replaceAll(...)");
                JSONObject jSONObject19 = new JSONObject(p.s("\\\\'", "compile(...)", strReplaceAll, BuildConfig.VERSION_NAME, "replaceAll(...)"));
                Iterator<String> itKeys10 = jSONObject19.keys();
                while (itKeys10.hasNext()) {
                    String next2 = itKeys10.next();
                    JSONObject jSONObject20 = jSONObject19.getJSONObject(next2);
                    try {
                        Unit unit = (Unit) new Gson().fromJson(jSONObject20.toString(), Unit.class);
                        Long lValueOf = Long.valueOf(next2);
                        kotlin.jvm.internal.m.e(lValueOf, "valueOf(...)");
                        unit.setUnitId(lValueOf.longValue());
                        arrayListN10.add(unit);
                    } catch (JsonSyntaxException e18) {
                        jSONObject20.toString();
                        e18.printStackTrace();
                    }
                }
                return arrayListN10;
            case 10:
                t0 t0Var11 = (t0) obj;
                ArrayList arrayListN11 = com.google.android.material.datepicker.d.n(t0Var11, "s");
                JSONObject jSONObject21 = new JSONObject((String) t0Var11.f44599b);
                Iterator<String> itKeys11 = jSONObject21.keys();
                while (itKeys11.hasNext()) {
                    JSONObject jSONObject22 = jSONObject21.getJSONObject(itKeys11.next());
                    try {
                        Model_Word_010 model_Word_010 = (Model_Word_010) new Gson().fromJson(jSONObject22.toString(), Model_Word_010.class);
                        String imageOptions = model_Word_010.getImageOptions();
                        kotlin.jvm.internal.m.e(imageOptions, "getImageOptions(...)");
                        if (!TextUtils.isEmpty(q.i1(x.q0(imageOptions, " ", BuildConfig.VERSION_NAME)).toString())) {
                            arrayListN11.add(model_Word_010);
                        }
                    } catch (JsonSyntaxException e19) {
                        jSONObject22.toString();
                        e19.printStackTrace();
                    }
                }
                return arrayListN11;
            default:
                t0 t0Var12 = (t0) obj;
                ArrayList arrayListN12 = com.google.android.material.datepicker.d.n(t0Var12, "s");
                JSONObject jSONObject23 = new JSONObject((String) t0Var12.f44599b);
                Iterator<String> itKeys12 = jSONObject23.keys();
                while (itKeys12.hasNext()) {
                    JSONObject jSONObject24 = jSONObject23.getJSONObject(itKeys12.next());
                    try {
                        arrayListN12.add((Word) new Gson().fromJson(jSONObject24.toString(), Word.class));
                    } catch (JsonSyntaxException e21) {
                        jSONObject24.toString();
                        e21.printStackTrace();
                    }
                }
                return arrayListN12;
        }
    }
}
