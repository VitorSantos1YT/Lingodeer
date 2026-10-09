package com.lingodeer.database;

import au.r;
import au.s;
import au.u;
import au.v;
import au.w;
import au.x;
import com.bumptech.glide.d;
import com.lingo.lingoskill.object.LessonDao;
import com.lingo.lingoskill.object.LevelDao;
import com.lingo.lingoskill.object.Model_Word_010Dao;
import com.lingo.lingoskill.object.UnitDao;
import com.lingodeer.database.ChineseToneDatabase_Impl;
import fz.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.z;
import qy.q;
import v5.e;
import w9.g;
import yt.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneDatabase_Impl extends ChineseToneDatabase {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f22334t = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f22335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q f22336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f22337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f22338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f22339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q f22340s;

    public ChineseToneDatabase_Impl() {
        final int i11 = 0;
        this.f22335n = d.v(new a(this) { // from class: yt.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChineseToneDatabase_Impl f58354b;

            {
                this.f58354b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                int i12 = i11;
                ChineseToneDatabase_Impl chineseToneDatabase_Impl = this.f58354b;
                switch (i12) {
                    case 0:
                        int i13 = ChineseToneDatabase_Impl.f22334t;
                        return new v(chineseToneDatabase_Impl);
                    case 1:
                        int i14 = ChineseToneDatabase_Impl.f22334t;
                        return new w(chineseToneDatabase_Impl);
                    case 2:
                        int i15 = ChineseToneDatabase_Impl.f22334t;
                        return new u(chineseToneDatabase_Impl);
                    case 3:
                        int i16 = ChineseToneDatabase_Impl.f22334t;
                        return new x(chineseToneDatabase_Impl);
                    case 4:
                        int i17 = ChineseToneDatabase_Impl.f22334t;
                        return new r(chineseToneDatabase_Impl);
                    default:
                        int i18 = ChineseToneDatabase_Impl.f22334t;
                        return new s(chineseToneDatabase_Impl);
                }
            }
        });
        final int i12 = 1;
        this.f22336o = d.v(new a(this) { // from class: yt.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChineseToneDatabase_Impl f58354b;

            {
                this.f58354b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                int i13 = i12;
                ChineseToneDatabase_Impl chineseToneDatabase_Impl = this.f58354b;
                switch (i13) {
                    case 0:
                        int i14 = ChineseToneDatabase_Impl.f22334t;
                        return new v(chineseToneDatabase_Impl);
                    case 1:
                        int i15 = ChineseToneDatabase_Impl.f22334t;
                        return new w(chineseToneDatabase_Impl);
                    case 2:
                        int i16 = ChineseToneDatabase_Impl.f22334t;
                        return new u(chineseToneDatabase_Impl);
                    case 3:
                        int i17 = ChineseToneDatabase_Impl.f22334t;
                        return new x(chineseToneDatabase_Impl);
                    case 4:
                        int i18 = ChineseToneDatabase_Impl.f22334t;
                        return new r(chineseToneDatabase_Impl);
                    default:
                        int i19 = ChineseToneDatabase_Impl.f22334t;
                        return new s(chineseToneDatabase_Impl);
                }
            }
        });
        final int i13 = 2;
        this.f22337p = d.v(new a(this) { // from class: yt.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChineseToneDatabase_Impl f58354b;

            {
                this.f58354b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                int i14 = i13;
                ChineseToneDatabase_Impl chineseToneDatabase_Impl = this.f58354b;
                switch (i14) {
                    case 0:
                        int i15 = ChineseToneDatabase_Impl.f22334t;
                        return new v(chineseToneDatabase_Impl);
                    case 1:
                        int i16 = ChineseToneDatabase_Impl.f22334t;
                        return new w(chineseToneDatabase_Impl);
                    case 2:
                        int i17 = ChineseToneDatabase_Impl.f22334t;
                        return new u(chineseToneDatabase_Impl);
                    case 3:
                        int i18 = ChineseToneDatabase_Impl.f22334t;
                        return new x(chineseToneDatabase_Impl);
                    case 4:
                        int i19 = ChineseToneDatabase_Impl.f22334t;
                        return new r(chineseToneDatabase_Impl);
                    default:
                        int i110 = ChineseToneDatabase_Impl.f22334t;
                        return new s(chineseToneDatabase_Impl);
                }
            }
        });
        final int i14 = 3;
        this.f22338q = d.v(new a(this) { // from class: yt.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChineseToneDatabase_Impl f58354b;

            {
                this.f58354b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                int i15 = i14;
                ChineseToneDatabase_Impl chineseToneDatabase_Impl = this.f58354b;
                switch (i15) {
                    case 0:
                        int i16 = ChineseToneDatabase_Impl.f22334t;
                        return new v(chineseToneDatabase_Impl);
                    case 1:
                        int i17 = ChineseToneDatabase_Impl.f22334t;
                        return new w(chineseToneDatabase_Impl);
                    case 2:
                        int i18 = ChineseToneDatabase_Impl.f22334t;
                        return new u(chineseToneDatabase_Impl);
                    case 3:
                        int i19 = ChineseToneDatabase_Impl.f22334t;
                        return new x(chineseToneDatabase_Impl);
                    case 4:
                        int i110 = ChineseToneDatabase_Impl.f22334t;
                        return new r(chineseToneDatabase_Impl);
                    default:
                        int i111 = ChineseToneDatabase_Impl.f22334t;
                        return new s(chineseToneDatabase_Impl);
                }
            }
        });
        final int i15 = 4;
        this.f22339r = d.v(new a(this) { // from class: yt.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChineseToneDatabase_Impl f58354b;

            {
                this.f58354b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                int i16 = i15;
                ChineseToneDatabase_Impl chineseToneDatabase_Impl = this.f58354b;
                switch (i16) {
                    case 0:
                        int i17 = ChineseToneDatabase_Impl.f22334t;
                        return new v(chineseToneDatabase_Impl);
                    case 1:
                        int i18 = ChineseToneDatabase_Impl.f22334t;
                        return new w(chineseToneDatabase_Impl);
                    case 2:
                        int i19 = ChineseToneDatabase_Impl.f22334t;
                        return new u(chineseToneDatabase_Impl);
                    case 3:
                        int i110 = ChineseToneDatabase_Impl.f22334t;
                        return new x(chineseToneDatabase_Impl);
                    case 4:
                        int i111 = ChineseToneDatabase_Impl.f22334t;
                        return new r(chineseToneDatabase_Impl);
                    default:
                        int i112 = ChineseToneDatabase_Impl.f22334t;
                        return new s(chineseToneDatabase_Impl);
                }
            }
        });
        final int i16 = 5;
        this.f22340s = d.v(new a(this) { // from class: yt.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChineseToneDatabase_Impl f58354b;

            {
                this.f58354b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                int i17 = i16;
                ChineseToneDatabase_Impl chineseToneDatabase_Impl = this.f58354b;
                switch (i17) {
                    case 0:
                        int i18 = ChineseToneDatabase_Impl.f22334t;
                        return new v(chineseToneDatabase_Impl);
                    case 1:
                        int i19 = ChineseToneDatabase_Impl.f22334t;
                        return new w(chineseToneDatabase_Impl);
                    case 2:
                        int i110 = ChineseToneDatabase_Impl.f22334t;
                        return new u(chineseToneDatabase_Impl);
                    case 3:
                        int i111 = ChineseToneDatabase_Impl.f22334t;
                        return new x(chineseToneDatabase_Impl);
                    case 4:
                        int i112 = ChineseToneDatabase_Impl.f22334t;
                        return new r(chineseToneDatabase_Impl);
                    default:
                        int i113 = ChineseToneDatabase_Impl.f22334t;
                        return new s(chineseToneDatabase_Impl);
                }
            }
        });
    }

    @Override // com.lingodeer.database.ChineseToneDatabase
    public final s A() {
        return (s) this.f22340s.getValue();
    }

    @Override // com.lingodeer.database.ChineseToneDatabase
    public final u B() {
        return (u) this.f22337p.getValue();
    }

    @Override // com.lingodeer.database.ChineseToneDatabase
    public final v C() {
        return (v) this.f22335n.getValue();
    }

    @Override // com.lingodeer.database.ChineseToneDatabase
    public final w D() {
        return (w) this.f22336o.getValue();
    }

    @Override // com.lingodeer.database.ChineseToneDatabase
    public final x E() {
        return (x) this.f22338q.getValue();
    }

    @Override // w9.s
    public final List f(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // w9.s
    public final g g() {
        return new g(this, new LinkedHashMap(), new LinkedHashMap(), LevelDao.TABLENAME, UnitDao.TABLENAME, LessonDao.TABLENAME, "ToneWord", Model_Word_010Dao.TABLENAME, "Model_Word_020");
    }

    @Override // w9.s
    public final e h() {
        return new b(this);
    }

    @Override // w9.s
    public final Set m() {
        return new LinkedHashSet();
    }

    @Override // w9.s
    public final LinkedHashMap o() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlin.jvm.internal.e eVarA = z.a(v.class);
        ry.r rVar = ry.r.f50854a;
        linkedHashMap.put(eVarA, rVar);
        linkedHashMap.put(z.a(w.class), rVar);
        linkedHashMap.put(z.a(u.class), rVar);
        linkedHashMap.put(z.a(x.class), rVar);
        linkedHashMap.put(z.a(r.class), rVar);
        linkedHashMap.put(z.a(s.class), rVar);
        return linkedHashMap;
    }

    @Override // com.lingodeer.database.ChineseToneDatabase
    public final r z() {
        return (r) this.f22339r.getValue();
    }
}
