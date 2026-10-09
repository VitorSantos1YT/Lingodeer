package com.google.android.gms.internal.fido;

import defpackage.e;
import ep.a;
import hh.p0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcz implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzcz f9700b = new zzcw(zzde.f9703a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9701a = 0;

    static {
        int i11 = zzcp.f9693a;
        new zzcr();
    }

    public static int h(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(p0.h(i11, "Beginning index: ", " < 0"));
        }
        if (i12 < i11) {
            throw new IndexOutOfBoundsException(p.p("Beginning index larger than ending index: ", i11, i12, ", "));
        }
        throw new IndexOutOfBoundsException(p.p("End index: ", i12, i13, " >= "));
    }

    public abstract byte b(int i11);

    public abstract byte d(int i11);

    public abstract int e();

    public abstract int f(int i11, int i12);

    public abstract zzcz g();

    public final int hashCode() {
        int iF = this.f9701a;
        if (iF == 0) {
            int iE = e();
            iF = f(iE, iE);
            if (iF == 0) {
                iF = 1;
            }
            this.f9701a = iF;
        }
        return iF;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzcq(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return a.k(e.q(e(), "<ByteString@", hexString, " size=", " contents=\""), e() <= 50 ? zzdg.a(this) : zzdg.a(g()).concat("..."), "\">");
    }
}
