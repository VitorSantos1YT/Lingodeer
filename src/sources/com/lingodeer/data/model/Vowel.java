package com.lingodeer.data.model;

import c00.a;
import c00.e;
import com.google.type.bACG.scNRoQgKSYX;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class Vowel {
    public static final Companion Companion = new Companion(null);
    private final String example1;
    private final String example2;
    private final String example3;
    private final String ipa;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return Vowel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ Vowel(int i11, String str, String str2, String str3, String str4, o1 o1Var) {
        if (15 != (i11 & 15)) {
            d1.k(i11, 15, Vowel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.ipa = str;
        this.example1 = str2;
        this.example2 = str3;
        this.example3 = str4;
    }

    public static /* synthetic */ Vowel copy$default(Vowel vowel, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = vowel.ipa;
        }
        if ((i11 & 2) != 0) {
            str2 = vowel.example1;
        }
        if ((i11 & 4) != 0) {
            str3 = vowel.example2;
        }
        if ((i11 & 8) != 0) {
            str4 = vowel.example3;
        }
        return vowel.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$data_release(Vowel vowel, b bVar, g gVar) {
        bVar.w(gVar, 0, vowel.ipa);
        bVar.w(gVar, 1, vowel.example1);
        bVar.w(gVar, 2, vowel.example2);
        bVar.w(gVar, 3, vowel.example3);
    }

    public final String component1() {
        return this.ipa;
    }

    public final String component2() {
        return this.example1;
    }

    public final String component3() {
        return this.example2;
    }

    public final String component4() {
        return this.example3;
    }

    public final Vowel copy(String ipa, String example1, String example2, String example3) {
        m.f(ipa, "ipa");
        m.f(example1, "example1");
        m.f(example2, "example2");
        m.f(example3, "example3");
        return new Vowel(ipa, example1, example2, example3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vowel)) {
            return false;
        }
        Vowel vowel = (Vowel) obj;
        return m.a(this.ipa, vowel.ipa) && m.a(this.example1, vowel.example1) && m.a(this.example2, vowel.example2) && m.a(this.example3, vowel.example3);
    }

    public final String getExample1() {
        return this.example1;
    }

    public final String getExample2() {
        return this.example2;
    }

    public final String getExample3() {
        return this.example3;
    }

    public final String getIpa() {
        return this.ipa;
    }

    public int hashCode() {
        return this.example3.hashCode() + defpackage.e.d(defpackage.e.d(this.ipa.hashCode() * 31, 31, this.example1), 31, this.example2);
    }

    public Vowel(String ipa, String example1, String example2, String example3) {
        m.f(ipa, "ipa");
        m.f(example1, "example1");
        m.f(example2, "example2");
        m.f(example3, "example3");
        this.ipa = ipa;
        this.example1 = example1;
        this.example2 = example2;
        this.example3 = example3;
    }

    public String toString() {
        String str = this.ipa;
        String str2 = this.example1;
        return defpackage.e.p(defpackage.e.s("Vowel(ipa=", str, scNRoQgKSYX.RnUlstqpMulU, str2, ", example2="), this.example2, ", example3=", this.example3, ")");
    }
}
