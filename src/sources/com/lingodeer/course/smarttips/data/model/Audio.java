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
public final class Audio {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int from;

    /* JADX INFO: renamed from: to, reason: collision with root package name */
    private final int f22254to;
    private final String url;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return Audio$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ Audio(int i11, int i12, int i13, String str, o1 o1Var) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, Audio$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.from = i12;
        this.f22254to = i13;
        this.url = str;
    }

    public static /* synthetic */ Audio copy$default(Audio audio, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = audio.from;
        }
        if ((i13 & 2) != 0) {
            i12 = audio.f22254to;
        }
        if ((i13 & 4) != 0) {
            str = audio.url;
        }
        return audio.copy(i11, i12, str);
    }

    public static final /* synthetic */ void write$Self$course_release(Audio audio, b bVar, g gVar) {
        bVar.g(0, audio.from, gVar);
        bVar.g(1, audio.f22254to, gVar);
        bVar.w(gVar, 2, audio.url);
    }

    public final int component1() {
        return this.from;
    }

    public final int component2() {
        return this.f22254to;
    }

    public final String component3() {
        return this.url;
    }

    public final Audio copy(int i11, int i12, String url) {
        m.f(url, "url");
        return new Audio(i11, i12, url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Audio)) {
            return false;
        }
        Audio audio = (Audio) obj;
        return this.from == audio.from && this.f22254to == audio.f22254to && m.a(this.url, audio.url);
    }

    public final int getFrom() {
        return this.from;
    }

    public final int getTo() {
        return this.f22254to;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + defpackage.e.b(this.f22254to, Integer.hashCode(this.from) * 31, 31);
    }

    public String toString() {
        int i11 = this.from;
        int i12 = this.f22254to;
        return ep.a.k(c.k("Audio(from=", i11, ", to=", i12, ", url="), this.url, ")");
    }

    public Audio(int i11, int i12, String url) {
        m.f(url, "url");
        this.from = i11;
        this.f22254to = i12;
        this.url = url;
    }
}
