package jr;

import com.lingodeer.data.model.CoursePracticeType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f36693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36694c;

    public /* synthetic */ q(long j11, int i11, int i12) {
        this.f36692a = i12;
        this.f36693b = j11;
        this.f36694c = i11;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f36692a) {
            case 0:
                return com.bumptech.glide.d.G(Long.valueOf(this.f36693b), Integer.valueOf(this.f36694c), CoursePracticeType.COURSE_STORY_READING);
            case 1:
                return com.bumptech.glide.d.G(Long.valueOf(this.f36693b), Integer.valueOf(this.f36694c));
            default:
                return com.bumptech.glide.d.G(Long.valueOf(this.f36693b), Integer.valueOf(this.f36694c));
        }
    }
}
