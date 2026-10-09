package com.lingodeer.data.model;

import bq.u;
import c00.a;
import c00.e;
import com.bumptech.glide.d;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qy.h;
import qy.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class ConstantVowels {
    private static final h[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final List<Constant> consonants;
    private final List<Vowel> vowels;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return ConstantVowels$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    static {
        j jVar = j.PUBLICATION;
        $childSerializers = new h[]{d.u(jVar, new u(22)), d.u(jVar, new u(23))};
    }

    public /* synthetic */ ConstantVowels(int i11, List list, List list2, o1 o1Var) {
        if (3 != (i11 & 3)) {
            d1.k(i11, 3, ConstantVowels$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.consonants = list;
        this.vowels = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ a _childSerializers$_anonymous_() {
        return new g00.d(Constant$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ a _childSerializers$_anonymous_$0() {
        return new g00.d(Vowel$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConstantVowels copy$default(ConstantVowels constantVowels, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = constantVowels.consonants;
        }
        if ((i11 & 2) != 0) {
            list2 = constantVowels.vowels;
        }
        return constantVowels.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$data_release(ConstantVowels constantVowels, b bVar, g gVar) {
        h[] hVarArr = $childSerializers;
        bVar.A(gVar, 0, (a) hVarArr[0].getValue(), constantVowels.consonants);
        bVar.A(gVar, 1, (a) hVarArr[1].getValue(), constantVowels.vowels);
    }

    public final List<Constant> component1() {
        return this.consonants;
    }

    public final List<Vowel> component2() {
        return this.vowels;
    }

    public final ConstantVowels copy(List<Constant> consonants, List<Vowel> vowels) {
        m.f(consonants, "consonants");
        m.f(vowels, "vowels");
        return new ConstantVowels(consonants, vowels);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConstantVowels)) {
            return false;
        }
        ConstantVowels constantVowels = (ConstantVowels) obj;
        return m.a(this.consonants, constantVowels.consonants) && m.a(this.vowels, constantVowels.vowels);
    }

    public final List<Constant> getConsonants() {
        return this.consonants;
    }

    public final List<Vowel> getVowels() {
        return this.vowels;
    }

    public int hashCode() {
        return this.vowels.hashCode() + (this.consonants.hashCode() * 31);
    }

    public String toString() {
        return "ConstantVowels(consonants=" + this.consonants + ", vowels=" + this.vowels + ")";
    }

    public ConstantVowels(List<Constant> consonants, List<Vowel> vowels) {
        m.f(consonants, "consonants");
        m.f(vowels, "vowels");
        this.consonants = consonants;
        this.vowels = vowels;
    }
}
