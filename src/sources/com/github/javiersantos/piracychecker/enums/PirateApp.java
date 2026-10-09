package com.github.javiersantos.piracychecker.enums;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class PirateApp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppType f7773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f7774c;

    public PirateApp(String str, String[] strArr, AppType type) {
        m.f(type, "type");
        this.f7772a = str;
        this.f7774c = (String[]) strArr.clone();
        this.f7773b = type;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = this.f7774c;
        if (strArr != null) {
            for (String str : strArr) {
                sb2.append(str);
            }
        }
        String string = sb2.toString();
        m.e(string, "sb.toString()");
        return string;
    }
}
