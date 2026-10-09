package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2435l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2436n;

    public final void a(int i11) {
        if ((this.f2427d & i11) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i11) + " but it is " + Integer.toBinaryString(this.f2427d));
    }

    public final int b() {
        return this.f2430g ? this.f2425b - this.f2426c : this.f2428e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
        sb2.append(this.f2424a);
        sb2.append(", mData=null, mItemCount=");
        sb2.append(this.f2428e);
        sb2.append(", mIsMeasuring=");
        sb2.append(this.f2432i);
        sb2.append(", mPreviousLayoutItemCount=");
        sb2.append(this.f2425b);
        sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb2.append(this.f2426c);
        sb2.append(", mStructureChanged=");
        sb2.append(this.f2429f);
        sb2.append(", mInPreLayout=");
        sb2.append(this.f2430g);
        sb2.append(", mRunSimpleAnimations=");
        sb2.append(this.f2433j);
        sb2.append(", mRunPredictiveAnimations=");
        return ep.a.l(sb2, this.f2434k, '}');
    }
}
