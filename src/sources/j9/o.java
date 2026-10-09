package j9;

import android.net.Uri;
import android.os.Bundle;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final oz.o m = new oz.o("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final oz.o f36218n = new oz.o("\\{(.+?)\\}");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final oz.o f36219o = new oz.o("http[s]?://");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final oz.o f36220p = new oz.o(".*");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final oz.o f36221q = new oz.o("([^/]*?|)");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final oz.o f36222r = new oz.o("^[^?#]+\\?([^#]*).*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f36224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qy.q f36226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qy.q f36227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f36228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f36230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f36231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f36232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qy.q f36233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f36234l;

    public o(String str) {
        this.f36223a = str;
        ArrayList arrayList = new ArrayList();
        this.f36224b = arrayList;
        final int i11 = 0;
        this.f36226d = com.bumptech.glide.d.v(new fz.a(this) { // from class: j9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f36213b;

            {
                this.f36213b = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, qy.h] */
            @Override // fz.a
            public final Object invoke() {
                List list;
                switch (i11) {
                    case 0:
                        String str2 = this.f36213b.f36225c;
                        if (str2 != null) {
                            return new oz.o(str2, oz.p.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str3 = this.f36213b.f36223a;
                        return Boolean.valueOf(str3 != null && o.f36222r.f(str3));
                    case 2:
                        o oVar = this.f36213b;
                        String str4 = oVar.f36223a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f36227e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.e(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i12 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(ep.a.h("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) ry.m.s0(queryParameters);
                                if (str6 == null) {
                                    oVar.f36229g = true;
                                    str6 = str5;
                                }
                                oz.l lVarB = o.f36218n.b(str6);
                                n nVar = new n();
                                int i13 = 0;
                                while (lVarB != null) {
                                    oz.i iVarD = lVarB.f46171c.d(i12);
                                    kotlin.jvm.internal.m.c(iVarD);
                                    int i14 = i12;
                                    nVar.f36217b.add(iVarD.f46163a);
                                    if (lVarB.b().f40532a > i13) {
                                        String strSubstring = str6.substring(i13, lVarB.b().f40532a);
                                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.e(strQuote, "quote(...)");
                                        sb2.append(strQuote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i13 = lVarB.b().f40533b + 1;
                                    lVarB = lVarB.d();
                                    i12 = i14;
                                }
                                if (i13 < str6.length()) {
                                    String strSubstring2 = str6.substring(i13);
                                    kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.e(strQuote2, "quote(...)");
                                    sb2.append(strQuote2);
                                }
                                sb2.append("$");
                                String string = sb2.toString();
                                kotlin.jvm.internal.m.e(string, "toString(...)");
                                nVar.f36216a = o.g(string);
                                linkedHashMap.put(str5, nVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f36213b.f36223a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        kotlin.jvm.internal.m.c(fragment);
                        o.a(fragment, arrayList2, sb3);
                        return new qy.l(arrayList2, sb3.toString());
                    case 4:
                        qy.l lVar = (qy.l) this.f36213b.f36230h.getValue();
                        return (lVar == null || (list = (List) lVar.f48495a) == null) ? new ArrayList() : list;
                    case 5:
                        qy.l lVar2 = (qy.l) this.f36213b.f36230h.getValue();
                        if (lVar2 != null) {
                            return (String) lVar2.f48496b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f36213b.f36232j.getValue();
                        if (str8 != null) {
                            return new oz.o(str8, oz.p.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i12 = 1;
        this.f36227e = com.bumptech.glide.d.v(new fz.a(this) { // from class: j9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f36213b;

            {
                this.f36213b = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, qy.h] */
            @Override // fz.a
            public final Object invoke() {
                List list;
                switch (i12) {
                    case 0:
                        String str2 = this.f36213b.f36225c;
                        if (str2 != null) {
                            return new oz.o(str2, oz.p.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str3 = this.f36213b.f36223a;
                        return Boolean.valueOf(str3 != null && o.f36222r.f(str3));
                    case 2:
                        o oVar = this.f36213b;
                        String str4 = oVar.f36223a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f36227e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.e(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i13 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(ep.a.h("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) ry.m.s0(queryParameters);
                                if (str6 == null) {
                                    oVar.f36229g = true;
                                    str6 = str5;
                                }
                                oz.l lVarB = o.f36218n.b(str6);
                                n nVar = new n();
                                int i14 = 0;
                                while (lVarB != null) {
                                    oz.i iVarD = lVarB.f46171c.d(i13);
                                    kotlin.jvm.internal.m.c(iVarD);
                                    int i15 = i13;
                                    nVar.f36217b.add(iVarD.f46163a);
                                    if (lVarB.b().f40532a > i14) {
                                        String strSubstring = str6.substring(i14, lVarB.b().f40532a);
                                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.e(strQuote, "quote(...)");
                                        sb2.append(strQuote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i14 = lVarB.b().f40533b + 1;
                                    lVarB = lVarB.d();
                                    i13 = i15;
                                }
                                if (i14 < str6.length()) {
                                    String strSubstring2 = str6.substring(i14);
                                    kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.e(strQuote2, "quote(...)");
                                    sb2.append(strQuote2);
                                }
                                sb2.append("$");
                                String string = sb2.toString();
                                kotlin.jvm.internal.m.e(string, "toString(...)");
                                nVar.f36216a = o.g(string);
                                linkedHashMap.put(str5, nVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f36213b.f36223a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        kotlin.jvm.internal.m.c(fragment);
                        o.a(fragment, arrayList2, sb3);
                        return new qy.l(arrayList2, sb3.toString());
                    case 4:
                        qy.l lVar = (qy.l) this.f36213b.f36230h.getValue();
                        return (lVar == null || (list = (List) lVar.f48495a) == null) ? new ArrayList() : list;
                    case 5:
                        qy.l lVar2 = (qy.l) this.f36213b.f36230h.getValue();
                        if (lVar2 != null) {
                            return (String) lVar2.f48496b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f36213b.f36232j.getValue();
                        if (str8 != null) {
                            return new oz.o(str8, oz.p.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        qy.j jVar = qy.j.NONE;
        final int i13 = 2;
        this.f36228f = com.bumptech.glide.d.u(jVar, new fz.a(this) { // from class: j9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f36213b;

            {
                this.f36213b = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, qy.h] */
            @Override // fz.a
            public final Object invoke() {
                List list;
                switch (i13) {
                    case 0:
                        String str2 = this.f36213b.f36225c;
                        if (str2 != null) {
                            return new oz.o(str2, oz.p.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str3 = this.f36213b.f36223a;
                        return Boolean.valueOf(str3 != null && o.f36222r.f(str3));
                    case 2:
                        o oVar = this.f36213b;
                        String str4 = oVar.f36223a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f36227e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.e(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i14 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(ep.a.h("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) ry.m.s0(queryParameters);
                                if (str6 == null) {
                                    oVar.f36229g = true;
                                    str6 = str5;
                                }
                                oz.l lVarB = o.f36218n.b(str6);
                                n nVar = new n();
                                int i15 = 0;
                                while (lVarB != null) {
                                    oz.i iVarD = lVarB.f46171c.d(i14);
                                    kotlin.jvm.internal.m.c(iVarD);
                                    int i16 = i14;
                                    nVar.f36217b.add(iVarD.f46163a);
                                    if (lVarB.b().f40532a > i15) {
                                        String strSubstring = str6.substring(i15, lVarB.b().f40532a);
                                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.e(strQuote, "quote(...)");
                                        sb2.append(strQuote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i15 = lVarB.b().f40533b + 1;
                                    lVarB = lVarB.d();
                                    i14 = i16;
                                }
                                if (i15 < str6.length()) {
                                    String strSubstring2 = str6.substring(i15);
                                    kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.e(strQuote2, "quote(...)");
                                    sb2.append(strQuote2);
                                }
                                sb2.append("$");
                                String string = sb2.toString();
                                kotlin.jvm.internal.m.e(string, "toString(...)");
                                nVar.f36216a = o.g(string);
                                linkedHashMap.put(str5, nVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f36213b.f36223a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        kotlin.jvm.internal.m.c(fragment);
                        o.a(fragment, arrayList2, sb3);
                        return new qy.l(arrayList2, sb3.toString());
                    case 4:
                        qy.l lVar = (qy.l) this.f36213b.f36230h.getValue();
                        return (lVar == null || (list = (List) lVar.f48495a) == null) ? new ArrayList() : list;
                    case 5:
                        qy.l lVar2 = (qy.l) this.f36213b.f36230h.getValue();
                        if (lVar2 != null) {
                            return (String) lVar2.f48496b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f36213b.f36232j.getValue();
                        if (str8 != null) {
                            return new oz.o(str8, oz.p.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i14 = 3;
        this.f36230h = com.bumptech.glide.d.u(jVar, new fz.a(this) { // from class: j9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f36213b;

            {
                this.f36213b = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, qy.h] */
            @Override // fz.a
            public final Object invoke() {
                List list;
                switch (i14) {
                    case 0:
                        String str2 = this.f36213b.f36225c;
                        if (str2 != null) {
                            return new oz.o(str2, oz.p.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str3 = this.f36213b.f36223a;
                        return Boolean.valueOf(str3 != null && o.f36222r.f(str3));
                    case 2:
                        o oVar = this.f36213b;
                        String str4 = oVar.f36223a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f36227e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.e(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i15 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(ep.a.h("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) ry.m.s0(queryParameters);
                                if (str6 == null) {
                                    oVar.f36229g = true;
                                    str6 = str5;
                                }
                                oz.l lVarB = o.f36218n.b(str6);
                                n nVar = new n();
                                int i16 = 0;
                                while (lVarB != null) {
                                    oz.i iVarD = lVarB.f46171c.d(i15);
                                    kotlin.jvm.internal.m.c(iVarD);
                                    int i17 = i15;
                                    nVar.f36217b.add(iVarD.f46163a);
                                    if (lVarB.b().f40532a > i16) {
                                        String strSubstring = str6.substring(i16, lVarB.b().f40532a);
                                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.e(strQuote, "quote(...)");
                                        sb2.append(strQuote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i16 = lVarB.b().f40533b + 1;
                                    lVarB = lVarB.d();
                                    i15 = i17;
                                }
                                if (i16 < str6.length()) {
                                    String strSubstring2 = str6.substring(i16);
                                    kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.e(strQuote2, "quote(...)");
                                    sb2.append(strQuote2);
                                }
                                sb2.append("$");
                                String string = sb2.toString();
                                kotlin.jvm.internal.m.e(string, "toString(...)");
                                nVar.f36216a = o.g(string);
                                linkedHashMap.put(str5, nVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f36213b.f36223a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        kotlin.jvm.internal.m.c(fragment);
                        o.a(fragment, arrayList2, sb3);
                        return new qy.l(arrayList2, sb3.toString());
                    case 4:
                        qy.l lVar = (qy.l) this.f36213b.f36230h.getValue();
                        return (lVar == null || (list = (List) lVar.f48495a) == null) ? new ArrayList() : list;
                    case 5:
                        qy.l lVar2 = (qy.l) this.f36213b.f36230h.getValue();
                        if (lVar2 != null) {
                            return (String) lVar2.f48496b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f36213b.f36232j.getValue();
                        if (str8 != null) {
                            return new oz.o(str8, oz.p.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i15 = 4;
        this.f36231i = com.bumptech.glide.d.u(jVar, new fz.a(this) { // from class: j9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f36213b;

            {
                this.f36213b = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, qy.h] */
            @Override // fz.a
            public final Object invoke() {
                List list;
                switch (i15) {
                    case 0:
                        String str2 = this.f36213b.f36225c;
                        if (str2 != null) {
                            return new oz.o(str2, oz.p.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str3 = this.f36213b.f36223a;
                        return Boolean.valueOf(str3 != null && o.f36222r.f(str3));
                    case 2:
                        o oVar = this.f36213b;
                        String str4 = oVar.f36223a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f36227e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.e(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i16 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(ep.a.h("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) ry.m.s0(queryParameters);
                                if (str6 == null) {
                                    oVar.f36229g = true;
                                    str6 = str5;
                                }
                                oz.l lVarB = o.f36218n.b(str6);
                                n nVar = new n();
                                int i17 = 0;
                                while (lVarB != null) {
                                    oz.i iVarD = lVarB.f46171c.d(i16);
                                    kotlin.jvm.internal.m.c(iVarD);
                                    int i18 = i16;
                                    nVar.f36217b.add(iVarD.f46163a);
                                    if (lVarB.b().f40532a > i17) {
                                        String strSubstring = str6.substring(i17, lVarB.b().f40532a);
                                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.e(strQuote, "quote(...)");
                                        sb2.append(strQuote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i17 = lVarB.b().f40533b + 1;
                                    lVarB = lVarB.d();
                                    i16 = i18;
                                }
                                if (i17 < str6.length()) {
                                    String strSubstring2 = str6.substring(i17);
                                    kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.e(strQuote2, "quote(...)");
                                    sb2.append(strQuote2);
                                }
                                sb2.append("$");
                                String string = sb2.toString();
                                kotlin.jvm.internal.m.e(string, "toString(...)");
                                nVar.f36216a = o.g(string);
                                linkedHashMap.put(str5, nVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f36213b.f36223a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        kotlin.jvm.internal.m.c(fragment);
                        o.a(fragment, arrayList2, sb3);
                        return new qy.l(arrayList2, sb3.toString());
                    case 4:
                        qy.l lVar = (qy.l) this.f36213b.f36230h.getValue();
                        return (lVar == null || (list = (List) lVar.f48495a) == null) ? new ArrayList() : list;
                    case 5:
                        qy.l lVar2 = (qy.l) this.f36213b.f36230h.getValue();
                        if (lVar2 != null) {
                            return (String) lVar2.f48496b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f36213b.f36232j.getValue();
                        if (str8 != null) {
                            return new oz.o(str8, oz.p.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i16 = 5;
        this.f36232j = com.bumptech.glide.d.u(jVar, new fz.a(this) { // from class: j9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f36213b;

            {
                this.f36213b = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, qy.h] */
            @Override // fz.a
            public final Object invoke() {
                List list;
                switch (i16) {
                    case 0:
                        String str2 = this.f36213b.f36225c;
                        if (str2 != null) {
                            return new oz.o(str2, oz.p.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str3 = this.f36213b.f36223a;
                        return Boolean.valueOf(str3 != null && o.f36222r.f(str3));
                    case 2:
                        o oVar = this.f36213b;
                        String str4 = oVar.f36223a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f36227e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.e(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i17 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(ep.a.h("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) ry.m.s0(queryParameters);
                                if (str6 == null) {
                                    oVar.f36229g = true;
                                    str6 = str5;
                                }
                                oz.l lVarB = o.f36218n.b(str6);
                                n nVar = new n();
                                int i18 = 0;
                                while (lVarB != null) {
                                    oz.i iVarD = lVarB.f46171c.d(i17);
                                    kotlin.jvm.internal.m.c(iVarD);
                                    int i19 = i17;
                                    nVar.f36217b.add(iVarD.f46163a);
                                    if (lVarB.b().f40532a > i18) {
                                        String strSubstring = str6.substring(i18, lVarB.b().f40532a);
                                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.e(strQuote, "quote(...)");
                                        sb2.append(strQuote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i18 = lVarB.b().f40533b + 1;
                                    lVarB = lVarB.d();
                                    i17 = i19;
                                }
                                if (i18 < str6.length()) {
                                    String strSubstring2 = str6.substring(i18);
                                    kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.e(strQuote2, "quote(...)");
                                    sb2.append(strQuote2);
                                }
                                sb2.append("$");
                                String string = sb2.toString();
                                kotlin.jvm.internal.m.e(string, "toString(...)");
                                nVar.f36216a = o.g(string);
                                linkedHashMap.put(str5, nVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f36213b.f36223a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        kotlin.jvm.internal.m.c(fragment);
                        o.a(fragment, arrayList2, sb3);
                        return new qy.l(arrayList2, sb3.toString());
                    case 4:
                        qy.l lVar = (qy.l) this.f36213b.f36230h.getValue();
                        return (lVar == null || (list = (List) lVar.f48495a) == null) ? new ArrayList() : list;
                    case 5:
                        qy.l lVar2 = (qy.l) this.f36213b.f36230h.getValue();
                        if (lVar2 != null) {
                            return (String) lVar2.f48496b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f36213b.f36232j.getValue();
                        if (str8 != null) {
                            return new oz.o(str8, oz.p.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i17 = 6;
        this.f36233k = com.bumptech.glide.d.v(new fz.a(this) { // from class: j9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f36213b;

            {
                this.f36213b = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, qy.h] */
            @Override // fz.a
            public final Object invoke() {
                List list;
                switch (i17) {
                    case 0:
                        String str2 = this.f36213b.f36225c;
                        if (str2 != null) {
                            return new oz.o(str2, oz.p.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str3 = this.f36213b.f36223a;
                        return Boolean.valueOf(str3 != null && o.f36222r.f(str3));
                    case 2:
                        o oVar = this.f36213b;
                        String str4 = oVar.f36223a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f36227e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.e(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i18 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(ep.a.h("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) ry.m.s0(queryParameters);
                                if (str6 == null) {
                                    oVar.f36229g = true;
                                    str6 = str5;
                                }
                                oz.l lVarB = o.f36218n.b(str6);
                                n nVar = new n();
                                int i19 = 0;
                                while (lVarB != null) {
                                    oz.i iVarD = lVarB.f46171c.d(i18);
                                    kotlin.jvm.internal.m.c(iVarD);
                                    int i110 = i18;
                                    nVar.f36217b.add(iVarD.f46163a);
                                    if (lVarB.b().f40532a > i19) {
                                        String strSubstring = str6.substring(i19, lVarB.b().f40532a);
                                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.e(strQuote, "quote(...)");
                                        sb2.append(strQuote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i19 = lVarB.b().f40533b + 1;
                                    lVarB = lVarB.d();
                                    i18 = i110;
                                }
                                if (i19 < str6.length()) {
                                    String strSubstring2 = str6.substring(i19);
                                    kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.e(strQuote2, "quote(...)");
                                    sb2.append(strQuote2);
                                }
                                sb2.append("$");
                                String string = sb2.toString();
                                kotlin.jvm.internal.m.e(string, "toString(...)");
                                nVar.f36216a = o.g(string);
                                linkedHashMap.put(str5, nVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f36213b.f36223a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        kotlin.jvm.internal.m.c(fragment);
                        o.a(fragment, arrayList2, sb3);
                        return new qy.l(arrayList2, sb3.toString());
                    case 4:
                        qy.l lVar = (qy.l) this.f36213b.f36230h.getValue();
                        return (lVar == null || (list = (List) lVar.f48495a) == null) ? new ArrayList() : list;
                    case 5:
                        qy.l lVar2 = (qy.l) this.f36213b.f36230h.getValue();
                        if (lVar2 != null) {
                            return (String) lVar2.f48496b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f36213b.f36232j.getValue();
                        if (str8 != null) {
                            return new oz.o(str8, oz.p.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i18 = 7;
        com.bumptech.glide.d.v(new fz.a(this) { // from class: j9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f36213b;

            {
                this.f36213b = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, qy.h] */
            @Override // fz.a
            public final Object invoke() {
                List list;
                switch (i18) {
                    case 0:
                        String str2 = this.f36213b.f36225c;
                        if (str2 != null) {
                            return new oz.o(str2, oz.p.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str3 = this.f36213b.f36223a;
                        return Boolean.valueOf(str3 != null && o.f36222r.f(str3));
                    case 2:
                        o oVar = this.f36213b;
                        String str4 = oVar.f36223a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f36227e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            kotlin.jvm.internal.m.e(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i19 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(ep.a.h("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) ry.m.s0(queryParameters);
                                if (str6 == null) {
                                    oVar.f36229g = true;
                                    str6 = str5;
                                }
                                oz.l lVarB = o.f36218n.b(str6);
                                n nVar = new n();
                                int i110 = 0;
                                while (lVarB != null) {
                                    oz.i iVarD = lVarB.f46171c.d(i19);
                                    kotlin.jvm.internal.m.c(iVarD);
                                    int i111 = i19;
                                    nVar.f36217b.add(iVarD.f46163a);
                                    if (lVarB.b().f40532a > i110) {
                                        String strSubstring = str6.substring(i110, lVarB.b().f40532a);
                                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        kotlin.jvm.internal.m.e(strQuote, "quote(...)");
                                        sb2.append(strQuote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i110 = lVarB.b().f40533b + 1;
                                    lVarB = lVarB.d();
                                    i19 = i111;
                                }
                                if (i110 < str6.length()) {
                                    String strSubstring2 = str6.substring(i110);
                                    kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    kotlin.jvm.internal.m.e(strQuote2, "quote(...)");
                                    sb2.append(strQuote2);
                                }
                                sb2.append("$");
                                String string = sb2.toString();
                                kotlin.jvm.internal.m.e(string, "toString(...)");
                                nVar.f36216a = o.g(string);
                                linkedHashMap.put(str5, nVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f36213b.f36223a;
                        Uri uri2 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        kotlin.jvm.internal.m.e(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        kotlin.jvm.internal.m.c(fragment);
                        o.a(fragment, arrayList2, sb3);
                        return new qy.l(arrayList2, sb3.toString());
                    case 4:
                        qy.l lVar = (qy.l) this.f36213b.f36230h.getValue();
                        return (lVar == null || (list = (List) lVar.f48495a) == null) ? new ArrayList() : list;
                    case 5:
                        qy.l lVar2 = (qy.l) this.f36213b.f36230h.getValue();
                        if (lVar2 != null) {
                            return (String) lVar2.f48496b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f36213b.f36232j.getValue();
                        if (str8 != null) {
                            return new oz.o(str8, oz.p.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb2 = new StringBuilder("^");
        if (!m.a(str)) {
            String strPattern = f36219o.f46176a.pattern();
            kotlin.jvm.internal.m.e(strPattern, "pattern(...)");
            sb2.append(strPattern);
        }
        Pattern patternCompile = Pattern.compile("(\\?|#|$)");
        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(str);
        kotlin.jvm.internal.m.e(matcher, "matcher(...)");
        boolean z11 = false;
        oz.l lVarE = se.k.e(matcher, 0, str);
        if (lVarE != null) {
            String strSubstring = str.substring(0, lVarE.b().f40532a);
            kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
            a(strSubstring, arrayList, sb2);
            if (!f36220p.a(sb2) && !f36221q.a(sb2)) {
                z11 = true;
            }
            this.f36234l = z11;
            sb2.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        this.f36225c = g(string);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb2) {
        int i11 = 0;
        for (oz.l lVarB = f36218n.b(str); lVarB != null; lVarB = lVarB.d()) {
            oz.i iVarD = lVarB.f46171c.d(1);
            kotlin.jvm.internal.m.c(iVarD);
            arrayList.add(iVarD.f46163a);
            if (lVarB.b().f40532a > i11) {
                String strSubstring = str.substring(i11, lVarB.b().f40532a);
                kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                String strQuote = Pattern.quote(strSubstring);
                kotlin.jvm.internal.m.e(strQuote, "quote(...)");
                sb2.append(strQuote);
            }
            String strPattern = f36221q.f46176a.pattern();
            kotlin.jvm.internal.m.e(strPattern, "pattern(...)");
            sb2.append(strPattern);
            i11 = lVarB.b().f40533b + 1;
        }
        if (i11 < str.length()) {
            String strSubstring2 = str.substring(i11);
            kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
            String strQuote2 = Pattern.quote(strSubstring2);
            kotlin.jvm.internal.m.e(strQuote2, "quote(...)");
            sb2.append(strQuote2);
        }
    }

    public static String g(String str) {
        if (oz.q.v0(str, "\\Q", false) && oz.q.v0(str, "\\E", false)) {
            return oz.x.q0(str, ".*", "\\E.*\\Q");
        }
        return oz.q.v0(str, "\\.\\*", false) ? oz.x.q0(str, "\\.\\*", ".*") : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(this.f36223a);
        kotlin.jvm.internal.m.e(uri2, "parse(...)");
        return ry.m.v0(pathSegments, uri2.getPathSegments()).size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, qy.h] */
    public final ArrayList c() {
        Collection collectionValues = ((Map) this.f36228f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ry.m.d0(arrayList, ((n) it.next()).f36217b);
        }
        return ry.m.H0(ry.m.H0(this.f36224b, arrayList), (List) this.f36231i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, qy.h] */
    public final Bundle d(Uri deepLink, LinkedHashMap arguments) {
        oz.l lVarE;
        oz.l lVarE2;
        String strDecode;
        kotlin.jvm.internal.m.f(deepLink, "deepLink");
        kotlin.jvm.internal.m.f(arguments, "arguments");
        oz.o oVar = (oz.o) this.f36226d.getValue();
        if (oVar != null && (lVarE = oVar.e(deepLink.toString())) != null) {
            int i11 = 0;
            Bundle bundleB = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
            if (e(lVarE, bundleB, arguments) && (!((Boolean) this.f36227e.getValue()).booleanValue() || f(deepLink, bundleB, arguments))) {
                String fragment = deepLink.getFragment();
                oz.o oVar2 = (oz.o) this.f36233k.getValue();
                if (oVar2 != null && (lVarE2 = oVar2.e(String.valueOf(fragment))) != null) {
                    List list = (List) this.f36231i.getValue();
                    ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        String str = (String) obj;
                        oz.i iVarD = lVarE2.f46171c.d(i12);
                        if (iVarD != null) {
                            strDecode = Uri.decode(iVarD.f46163a);
                            kotlin.jvm.internal.m.e(strDecode, "decode(...)");
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = BuildConfig.VERSION_NAME;
                        }
                        if (arguments.get(str) != null) {
                            throw new ClassCastException();
                        }
                        try {
                            ef.e.x(str, strDecode, bundleB);
                            arrayList.add(qy.b0.f48488a);
                            i11 = i12;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (c.a.C(arguments, new m(0, bundleB)).isEmpty()) {
                    return bundleB;
                }
            }
        }
        return null;
    }

    public final boolean e(oz.l lVar, Bundle bundle, Map map) {
        ArrayList arrayList = this.f36224b;
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            int i13 = i11 + 1;
            String strDecode = null;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            String str = (String) obj;
            oz.i iVarD = lVar.f46171c.d(i13);
            if (iVarD != null) {
                strDecode = Uri.decode(iVarD.f46163a);
                kotlin.jvm.internal.m.e(strDecode, "decode(...)");
            }
            if (strDecode == null) {
                strDecode = BuildConfig.VERSION_NAME;
            }
            if (map.get(str) != null) {
                throw new ClassCastException();
            }
            try {
                ef.e.x(str, strDecode, bundle);
                arrayList2.add(qy.b0.f48488a);
                i11 = i13;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof o)) {
            return false;
        }
        return this.f36223a.equals(((o) obj).f36223a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final boolean f(Uri uri, Bundle bundle, Map map) {
        oz.l lVar;
        ?? r9;
        Object objValueOf;
        String query;
        o oVar = this;
        for (Map.Entry entry : ((Map) oVar.f36228f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            n nVar = (n) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (oVar.f36229g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = ns.o.K(query);
            }
            qy.b0 b0Var = qy.b0.f48488a;
            boolean z11 = false;
            Bundle bundleB = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
            ArrayList arrayList = nVar.f36217b;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                if (map.get((String) obj) != null) {
                    throw new ClassCastException();
                }
            }
            for (String input : queryParameters) {
                String str2 = nVar.f36216a;
                if (str2 != null) {
                    Pattern patternCompile = Pattern.compile(str2);
                    kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                    kotlin.jvm.internal.m.f(input, "input");
                    Matcher matcher = patternCompile.matcher(input);
                    kotlin.jvm.internal.m.e(matcher, "matcher(...)");
                    if (matcher.matches()) {
                        lVar = new oz.l(matcher, input);
                    } else {
                        lVar = null;
                    }
                } else {
                    lVar = null;
                }
                if (lVar == null) {
                    return z11;
                }
                ?? r11 = nVar.f36217b;
                ArrayList arrayList2 = new ArrayList(ry.n.W(r11, 10));
                int size2 = r11.size();
                boolean z12 = z11;
                ?? r15 = z12;
                while (r9 < size2) {
                    Object obj2 = r11.get(r9);
                    int i12 = r9 + 1;
                    int i13 = r15 + 1;
                    if (r15 < 0) {
                        r9 = z12;
                        ns.o.V();
                        throw null;
                    }
                    String key = (String) obj2;
                    oz.i iVarD = lVar.f46171c.d(i13);
                    String str3 = iVarD != null ? iVarD.f46163a : null;
                    if (str3 == null) {
                        r9 = z12;
                        r9 = z12;
                        str3 = BuildConfig.VERSION_NAME;
                    }
                    r9 = z12;
                    r9 = z12;
                    if (map.get(key) != null) {
                        throw new ClassCastException();
                    }
                    try {
                        kotlin.jvm.internal.m.f(key, "key");
                        if (bundleB.containsKey(key)) {
                            objValueOf = Boolean.valueOf(!bundleB.containsKey(key));
                        } else {
                            ef.e.x(key, str3, bundleB);
                            objValueOf = b0Var;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    arrayList2.add(objValueOf);
                    r15 = i13;
                    z11 = false;
                    r9 = i12;
                }
                r9 = z12;
            }
            bundle.putAll(bundleB);
            oVar = this;
        }
        return true;
    }

    public final int hashCode() {
        return this.f36223a.hashCode() * 961;
    }
}
