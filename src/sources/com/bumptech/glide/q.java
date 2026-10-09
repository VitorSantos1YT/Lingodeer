package com.bumptech.glide;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ne.d f7700a = ne.b.f43760b;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final q clone() {
        try {
            return (q) super.clone();
        } catch (CloneNotSupportedException e8) {
            throw new RuntimeException(e8);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            return pe.m.b(this.f7700a, ((q) obj).f7700a);
        }
        return false;
    }

    public int hashCode() {
        ne.d dVar = this.f7700a;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }
}
