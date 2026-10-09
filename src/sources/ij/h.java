package ij;

import com.lingo.lingoskill.object.Word;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements tx.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f34433a = new h();

    @Override // tx.d
    public final Object apply(Object obj) {
        return Boolean.valueOf(kotlin.jvm.internal.m.a(((Word) obj).getFeatured(), "SPECIFIC"));
    }
}
