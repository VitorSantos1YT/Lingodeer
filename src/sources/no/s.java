package no;

import cf.x;
import com.google.firebase.database.DatabaseReference;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.speak.object.PodUser;
import hh.p0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DatabaseReference f43916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DatabaseReference f43917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DatabaseReference f43918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qy.q f43919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qy.q f43920e;

    public s(long j11) {
        final int i11 = 0;
        this.f43919d = com.bumptech.glide.d.v(new fz.a(this) { // from class: no.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f43861b;

            {
                this.f43861b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        s sVar = this.f43861b;
                        DatabaseReference databaseReference = sVar.f43917b;
                        if (databaseReference != null) {
                            return new n(qx.p.h(databaseReference), sVar, 0);
                        }
                        kotlin.jvm.internal.m.n("mLatestUserDb");
                        throw null;
                    default:
                        s sVar2 = this.f43861b;
                        DatabaseReference databaseReference2 = sVar2.f43918c;
                        if (databaseReference2 != null) {
                            return new n(qx.p.h(databaseReference2), sVar2, 1);
                        }
                        kotlin.jvm.internal.m.n("mTopUserDb");
                        throw null;
                }
            }
        });
        final int i12 = 1;
        this.f43920e = com.bumptech.glide.d.v(new fz.a(this) { // from class: no.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f43861b;

            {
                this.f43861b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        s sVar = this.f43861b;
                        DatabaseReference databaseReference = sVar.f43917b;
                        if (databaseReference != null) {
                            return new n(qx.p.h(databaseReference), sVar, 0);
                        }
                        kotlin.jvm.internal.m.n("mLatestUserDb");
                        throw null;
                    default:
                        s sVar2 = this.f43861b;
                        DatabaseReference databaseReference2 = sVar2.f43918c;
                        if (databaseReference2 != null) {
                            return new n(qx.p.h(databaseReference2), sVar2, 1);
                        }
                        kotlin.jvm.internal.m.n("mTopUserDb");
                        throw null;
                }
            }
        });
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i13 = x.n().keyLanguage;
        if (i13 == 0) {
            this.f43916a = p0.d("cn/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "user");
            this.f43917b = p0.d("cn/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "latest_user");
            this.f43918c = p0.d("cn/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "top_user");
            return;
        }
        if (i13 == 1) {
            this.f43916a = p0.d("jp/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "user");
            this.f43917b = p0.d("jp/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "latest_user");
            this.f43918c = p0.d("jp/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "top_user");
            return;
        }
        if (i13 == 2) {
            this.f43916a = p0.d("kr/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "user");
            this.f43917b = p0.d("kr/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "latest_user");
            this.f43918c = p0.d("kr/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "top_user");
            return;
        }
        if (i13 != 4) {
            if (i13 != 5) {
                if (i13 != 6) {
                    if (i13 != 8) {
                        if (i13 != 20) {
                            if (i13 != 22) {
                                if (i13 != 40) {
                                    if (i13 == 47 || i13 == 48) {
                                        this.f43916a = p0.d("esus/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "user");
                                        this.f43917b = p0.d("esus/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "latest_user");
                                        this.f43918c = p0.d("esus/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "top_user");
                                        return;
                                    }
                                    switch (i13) {
                                        case 11:
                                            this.f43916a = p0.d("cnup/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "user");
                                            this.f43917b = p0.d("cnup/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "latest_user");
                                            this.f43918c = p0.d("cnup/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "top_user");
                                            break;
                                        case 12:
                                            this.f43916a = p0.d("jpup/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "user");
                                            this.f43917b = p0.d("jpup/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "latest_user");
                                            this.f43918c = p0.d("jpup/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "top_user");
                                            break;
                                        case 13:
                                            this.f43916a = p0.d("krup/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "user");
                                            this.f43917b = p0.d("krup/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "latest_user");
                                            this.f43918c = p0.d("krup/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "top_user");
                                            break;
                                    }
                                    return;
                                }
                            }
                            this.f43916a = p0.d("ru/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "user");
                            this.f43917b = p0.d("ru/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "latest_user");
                            this.f43918c = p0.d("ru/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "top_user");
                            return;
                        }
                        this.f43916a = p0.d("it/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "user");
                        this.f43917b = p0.d("it/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "latest_user");
                        this.f43918c = p0.d("it/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "top_user");
                        return;
                    }
                    this.f43916a = p0.d("pt/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "user");
                    this.f43917b = p0.d("pt/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "latest_user");
                    this.f43918c = p0.d("pt/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "top_user");
                    return;
                }
                this.f43916a = p0.d("de/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "user");
                this.f43917b = p0.d("de/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "latest_user");
                this.f43918c = p0.d("de/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "top_user");
                return;
            }
            this.f43916a = p0.d("fr/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "user");
            this.f43917b = p0.d("fr/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "latest_user");
            this.f43918c = p0.d("fr/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "top_user");
            return;
        }
        this.f43916a = p0.d("es/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "user");
        this.f43917b = p0.d("es/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "latest_user");
        this.f43918c = p0.d("es/unit_", j11, nl.d.a("https://lingodeer-stories.firebaseio.com/"), "top_user");
    }

    public final void a(String str, String zipUrl) {
        kotlin.jvm.internal.m.f(zipUrl, "zipUrl");
        HashMap map = new HashMap();
        PodUser podUser = new PodUser();
        podUser.setUid(str);
        podUser.setTimestamp(System.currentTimeMillis());
        podUser.setVideourl(zipUrl);
        map.put(str, podUser.toMap());
        DatabaseReference databaseReference = this.f43916a;
        if (databaseReference == null) {
            kotlin.jvm.internal.m.n("mUserDb");
            throw null;
        }
        databaseReference.i(map, new c());
        DatabaseReference databaseReference2 = this.f43917b;
        if (databaseReference2 == null) {
            kotlin.jvm.internal.m.n("mLatestUserDb");
            throw null;
        }
        databaseReference2.g(new d(podUser));
        DatabaseReference databaseReference3 = this.f43918c;
        if (databaseReference3 != null) {
            databaseReference3.g(new e(podUser));
        } else {
            kotlin.jvm.internal.m.n("mTopUserDb");
            throw null;
        }
    }
}
