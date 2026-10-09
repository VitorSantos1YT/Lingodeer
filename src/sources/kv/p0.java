package kv;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f38809f;

    public p0(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        this.f38804a = str;
        this.f38805b = str2;
        this.f38806c = str3;
        this.f38807d = str4;
        this.f38808e = str5;
        this.f38809f = arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    public final l0 a() {
        m0 m0Var;
        switch (this.f38806c) {
            case "M1":
                m0Var = m0.M1;
                break;
            case "M2":
                m0Var = m0.M2;
                break;
            case "M3":
                m0Var = m0.M3;
                break;
            case "M4":
                m0Var = m0.M4;
                break;
            case "M5":
                m0Var = m0.M5;
                break;
            case "M6":
                m0Var = m0.M6;
                break;
            default:
                m0Var = m0.M0;
                break;
        }
        return new l0(m0Var, this.f38807d, this.f38808e, this.f38809f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f38804a.equals(p0Var.f38804a) && this.f38805b.equals(p0Var.f38805b) && this.f38806c.equals(p0Var.f38806c) && this.f38807d.equals(p0Var.f38807d) && this.f38808e.equals(p0Var.f38808e) && this.f38809f.equals(p0Var.f38809f);
    }

    public final int hashCode() {
        return this.f38809f.hashCode() + defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(this.f38804a.hashCode() * 31, 31, this.f38805b), 31, this.f38806c), 31, this.f38807d), 31, this.f38808e);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("ParsedQuestionRow(lesson=", this.f38804a, ", script=", this.f38805b, ", type=");
        com.google.android.material.datepicker.d.w(sbS, this.f38806c, ", character=", this.f38807d, ", romanization=");
        sbS.append(this.f38808e);
        sbS.append(", options=");
        sbS.append(this.f38809f);
        sbS.append(")");
        return sbS.toString();
    }
}
