package dj;

import com.bumptech.glide.d;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.DaoMaster;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.TravelCategoryDao;
import com.lingo.lingoskill.object.TravelPhraseDao;
import java.util.List;
import kotlin.jvm.internal.m;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static b f23431e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f23432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f23433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f23434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f23435d;

    public b(LingoSkillApplication lingoSkillApplication) {
        final int i11 = 0;
        this.f23432a = d.v(new fz.a(this) { // from class: dj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f23430b;

            {
                this.f23430b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        DaoSession daoSessionM210newSession = new DaoMaster(((jj.a) this.f23430b.f23435d.getValue()).getWritableDatabase()).m210newSession();
                        daoSessionM210newSession.clear();
                        return daoSessionM210newSession;
                    case 1:
                        return this.f23430b.b().getTravelCategoryDao();
                    case 2:
                        return this.f23430b.b().getTravelPhraseDao();
                    case 3:
                        return this.f23430b.b().getScSubCateDao();
                    default:
                        return new DaoMaster(((jj.a) this.f23430b.f23435d.getValue()).getWritableDatabase());
                }
            }
        });
        final int i12 = 1;
        this.f23433b = d.v(new fz.a(this) { // from class: dj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f23430b;

            {
                this.f23430b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        DaoSession daoSessionM210newSession = new DaoMaster(((jj.a) this.f23430b.f23435d.getValue()).getWritableDatabase()).m210newSession();
                        daoSessionM210newSession.clear();
                        return daoSessionM210newSession;
                    case 1:
                        return this.f23430b.b().getTravelCategoryDao();
                    case 2:
                        return this.f23430b.b().getTravelPhraseDao();
                    case 3:
                        return this.f23430b.b().getScSubCateDao();
                    default:
                        return new DaoMaster(((jj.a) this.f23430b.f23435d.getValue()).getWritableDatabase());
                }
            }
        });
        final int i13 = 2;
        this.f23434c = d.v(new fz.a(this) { // from class: dj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f23430b;

            {
                this.f23430b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        DaoSession daoSessionM210newSession = new DaoMaster(((jj.a) this.f23430b.f23435d.getValue()).getWritableDatabase()).m210newSession();
                        daoSessionM210newSession.clear();
                        return daoSessionM210newSession;
                    case 1:
                        return this.f23430b.b().getTravelCategoryDao();
                    case 2:
                        return this.f23430b.b().getTravelPhraseDao();
                    case 3:
                        return this.f23430b.b().getScSubCateDao();
                    default:
                        return new DaoMaster(((jj.a) this.f23430b.f23435d.getValue()).getWritableDatabase());
                }
            }
        });
        final int i14 = 3;
        d.v(new fz.a(this) { // from class: dj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f23430b;

            {
                this.f23430b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        DaoSession daoSessionM210newSession = new DaoMaster(((jj.a) this.f23430b.f23435d.getValue()).getWritableDatabase()).m210newSession();
                        daoSessionM210newSession.clear();
                        return daoSessionM210newSession;
                    case 1:
                        return this.f23430b.b().getTravelCategoryDao();
                    case 2:
                        return this.f23430b.b().getTravelPhraseDao();
                    case 3:
                        return this.f23430b.b().getScSubCateDao();
                    default:
                        return new DaoMaster(((jj.a) this.f23430b.f23435d.getValue()).getWritableDatabase());
                }
            }
        });
        this.f23435d = d.v(new com.google.firebase.sessions.a(lingoSkillApplication, 2));
        final int i15 = 4;
        d.v(new fz.a(this) { // from class: dj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f23430b;

            {
                this.f23430b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        DaoSession daoSessionM210newSession = new DaoMaster(((jj.a) this.f23430b.f23435d.getValue()).getWritableDatabase()).m210newSession();
                        daoSessionM210newSession.clear();
                        return daoSessionM210newSession;
                    case 1:
                        return this.f23430b.b().getTravelCategoryDao();
                    case 2:
                        return this.f23430b.b().getTravelPhraseDao();
                    case 3:
                        return this.f23430b.b().getScSubCateDao();
                    default:
                        return new DaoMaster(((jj.a) this.f23430b.f23435d.getValue()).getWritableDatabase());
                }
            }
        });
    }

    public final List a() {
        Object value = this.f23433b.getValue();
        m.e(value, "getValue(...)");
        List<Object> listLoadAll = ((TravelCategoryDao) value).loadAll();
        m.e(listLoadAll, "loadAll(...)");
        return listLoadAll;
    }

    public final DaoSession b() {
        Object value = this.f23432a.getValue();
        m.e(value, "getValue(...)");
        return (DaoSession) value;
    }

    public final TravelPhraseDao c() {
        Object value = this.f23434c.getValue();
        m.e(value, "getValue(...)");
        return (TravelPhraseDao) value;
    }
}
