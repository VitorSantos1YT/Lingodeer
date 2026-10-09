package vt;

import com.lingodeer.data.model.BookmarkFolder;
import com.lingodeer.data.model.BookmarkFolderKt;
import com.lingodeer.database.model.BookmarkFolderEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends xy.i implements fz.c {
    public final /* synthetic */ String H;
    public final /* synthetic */ kotlin.jvm.internal.y K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f54228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BookmarkFolder f54229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f54230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f54232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f54233f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f54234t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, r rVar, String str2, String str3, kotlin.jvm.internal.y yVar, vy.d dVar) {
        super(1, dVar);
        this.f54232e = str;
        this.f54233f = rVar;
        this.f54234t = str2;
        this.H = str3;
        this.K = yVar;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new i(this.f54232e, this.f54233f, this.f54234t, this.H, this.K, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((i) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String string;
        r rVar;
        Object objA;
        Object objD;
        long j11;
        String str;
        BookmarkFolder bookmarkFolder;
        Object objC;
        BookmarkFolder bookmarkFolder2;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f54231d;
        String str2 = this.f54234t;
        r rVar2 = this.f54233f;
        kotlin.jvm.internal.y yVar = this.K;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            string = oz.q.i1(this.f54232e).toString();
            this.f54228a = string;
            this.f54231d = 1;
            rVar = rVar2;
            objA = r.a(rVar, this.f54234t, this.H, string, null, this);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            String str3 = this.f54228a;
            com.bumptech.glide.e.F(obj);
            string = str3;
            rVar = rVar2;
            objA = obj;
        } else {
            if (i11 == 2) {
                long j12 = this.f54230c;
                String str4 = this.f54228a;
                com.bumptech.glide.e.F(obj);
                objD = obj;
                str = str4;
                rVar = rVar2;
                j11 = j12;
                int iIntValue = ((Number) objD).intValue();
                bookmarkFolder = new BookmarkFolder(com.bumptech.glide.f.h(iIntValue, str2, this.H), this.f54234t, this.H, str, iIntValue, false, j11);
                au.m mVar = rVar.f54283c;
                BookmarkFolderEntity bookmarkFolderEntityAsEntityModel = BookmarkFolderKt.asEntityModel(bookmarkFolder);
                this.f54228a = null;
                this.f54229b = bookmarkFolder;
                this.f54230c = j11;
                this.f54231d = 3;
                objC = cf.x.C(this, mVar.f3044a, false, true, new au.b(4, mVar, bookmarkFolderEntityAsEntityModel));
                if (objC != aVar) {
                    objC = b0Var;
                }
                if (objC != aVar) {
                    bookmarkFolder2 = bookmarkFolder;
                }
                return aVar;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bookmarkFolder2 = this.f54229b;
            com.bumptech.glide.e.F(obj);
        }
        yVar.f38361a = new x(bookmarkFolder2.getId());
        return b0Var;
        y yVar2 = (y) objA;
        if (yVar2 != null) {
            yVar.f38361a = yVar2;
            return b0Var;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f54228a = string;
        this.f54230c = jCurrentTimeMillis;
        this.f54231d = 2;
        objD = rVar.d(str2, ry.t.f50856a, this);
        if (objD != aVar) {
            j11 = jCurrentTimeMillis;
            str = string;
            int iIntValue2 = ((Number) objD).intValue();
            bookmarkFolder = new BookmarkFolder(com.bumptech.glide.f.h(iIntValue2, str2, this.H), this.f54234t, this.H, str, iIntValue2, false, j11);
            au.m mVar2 = rVar.f54283c;
            BookmarkFolderEntity bookmarkFolderEntityAsEntityModel2 = BookmarkFolderKt.asEntityModel(bookmarkFolder);
            this.f54228a = null;
            this.f54229b = bookmarkFolder;
            this.f54230c = j11;
            this.f54231d = 3;
            objC = cf.x.C(this, mVar2.f3044a, false, true, new au.b(4, mVar2, bookmarkFolderEntityAsEntityModel2));
            if (objC != aVar) {
                objC = b0Var;
            }
            if (objC != aVar) {
                bookmarkFolder2 = bookmarkFolder;
                yVar.f38361a = new x(bookmarkFolder2.getId());
                return b0Var;
            }
        }
        return aVar;
    }
}
