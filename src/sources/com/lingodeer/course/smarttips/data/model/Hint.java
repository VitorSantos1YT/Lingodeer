package com.lingodeer.course.smarttips.data.model;

import c00.a;
import c00.e;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e
public final class Hint {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int from;
    private final String text;

    /* JADX INFO: renamed from: to, reason: collision with root package name */
    private final int f22255to;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return Hint$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ Hint(int i11, int i12, int i13, String str, o1 o1Var) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, Hint$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.from = i12;
        this.f22255to = i13;
        this.text = str;
    }

    public static /* synthetic */ Hint copy$default(Hint hint, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = hint.from;
        }
        if ((i13 & 2) != 0) {
            i12 = hint.f22255to;
        }
        if ((i13 & 4) != 0) {
            str = hint.text;
        }
        return hint.copy(i11, i12, str);
    }

    public static final /* synthetic */ void write$Self$course_release(Hint hint, b bVar, g gVar) {
        bVar.g(0, hint.from, gVar);
        bVar.g(1, hint.f22255to, gVar);
        bVar.w(gVar, 2, hint.text);
    }

    public final int component1() {
        return this.from;
    }

    public final int component2() {
        return this.f22255to;
    }

    public final String component3() {
        return this.text;
    }

    public final Hint copy(int i11, int i12, String text) {
        m.f(text, "text");
        return new Hint(i11, i12, text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hint)) {
            return false;
        }
        Hint hint = (Hint) obj;
        return this.from == hint.from && this.f22255to == hint.f22255to && m.a(this.text, hint.text);
    }

    public final int getFrom() {
        return this.from;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTo() {
        return this.f22255to;
    }

    public int hashCode() {
        return this.text.hashCode() + defpackage.e.b(this.f22255to, Integer.hashCode(this.from) * 31, 31);
    }

    public String toString() {
        int i11 = this.from;
        int i12 = this.f22255to;
        return ep.a.k(c.k("Hint(from=", i11, ", to=", i12, ", text="), this.text, ")");
    }

    public Hint(int i11, int i12, String text) {
        m.f(text, "text");
        this.from = i11;
        this.f22255to = i12;
        this.text = text;
    }
}
