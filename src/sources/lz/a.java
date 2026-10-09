package lz;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements Iterable, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f40523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f40524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40525c = 1;

    public a(char c11, char c12) {
        this.f40523a = c11;
        this.f40524b = (char) com.bumptech.glide.e.v(c11, c12, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f40523a, this.f40524b, this.f40525c);
    }
}
