package com.google.firebase.sessions;

import android.content.Context;
import androidx.drawerlayout.widget.ktFt.FpIL;
import cf.x;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.data.env.Env;
import dl.ExOZ.xItStCyvVEZ;
import dm.d;
import i0.pKy.shrCcjmOhAmRC;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f21029b;

    public /* synthetic */ a(Context context, int i11) {
        this.f21028a = i11;
        this.f21029b = context;
    }

    @Override // fz.a
    public final Object invoke() throws IOException {
        int i11 = this.f21028a;
        Context context = this.f21029b;
        switch (i11) {
            case 0:
                FirebaseSessionsComponent.MainModule.Companion companion = FirebaseSessionsComponent.MainModule.Companion.f20892a;
                File fileP = ub.a.P(context, "firebaseSessions/sessionConfigsDataStore.data");
                FirebaseSessionsComponent.MainModule.Companion.f20892a.getClass();
                FirebaseSessionsComponent.MainModule.Companion.b(fileP);
                return fileP;
            case 1:
                FirebaseSessionsComponent.MainModule.Companion companion2 = FirebaseSessionsComponent.MainModule.Companion.f20892a;
                File fileP2 = ub.a.P(context, "firebaseSessions/sessionDataStore.data");
                FirebaseSessionsComponent.MainModule.Companion.f20892a.getClass();
                FirebaseSessionsComponent.MainModule.Companion.b(fileP2);
                return fileP2;
            case 2:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                int i12 = x.n().keyLanguage;
                Context context2 = this.f21029b;
                if (i12 == 10) {
                    Env envN = x.n();
                    m.f(context2, "context");
                    return new ao.a(context2, "ru_sc.db", null, 1, "ru_sc.zip", envN, 1);
                }
                if (i12 == 51) {
                    Env envN2 = x.n();
                    m.f(context2, "context");
                    return new sl.a(context2, "ar_sc.db", null, 1, "ar_sc.zip", envN2, 7);
                }
                if (i12 == 57) {
                    Env envN3 = x.n();
                    m.f(context2, "context");
                    return new ao.a(context2, "thai_sc.db", null, 1, "thai_sc.zip", envN3, 25);
                }
                if (i12 == 61) {
                    Env envN4 = x.n();
                    m.f(context2, "context");
                    return new ao.a(context2, "hi_sc.db", null, 1, shrCcjmOhAmRC.uBnMrJsKyPmcC, envN4, 16);
                }
                if (i12 == 63) {
                    Env envN5 = x.n();
                    m.f(context2, "context");
                    return new sl.a(context2, "ukr_sc.db", null, 1, "ukr_sc.zip", envN5, 13);
                }
                if (i12 == 65) {
                    Env envN6 = x.n();
                    m.f(context2, "context");
                    return new ao.a(context2, xItStCyvVEZ.boTrlvKhyKQKMB, null, 1, "grk_sc.zip", envN6, 3);
                }
                if (i12 == 69) {
                    Env envN7 = x.n();
                    m.f(context2, "context");
                    return new ao.a(context2, "mal_sc.db", null, 1, "mal_sc.zip", envN7, 12);
                }
                switch (i12) {
                    case 0:
                        Env envN8 = x.n();
                        m.f(context2, "context");
                        return new ao.a(context2, "cn_sc.db", null, 1, ypOOxsaJG.xGCiXLY, envN8, 4);
                    case 1:
                        Env envN9 = x.n();
                        m.f(context2, "context");
                        return new ao.a(context2, "jp_sc.db", null, 1, "jp_sc.zip", envN9, 7);
                    case 2:
                        Env envN10 = x.n();
                        m.f(context2, "context");
                        return new sl.a(context2, "kr_sc.db", null, 1, "kr_sc.zip", envN10, 10);
                    case 3:
                        Env envN11 = x.n();
                        m.f(context2, "context");
                        return new sl.a(context2, "en_sc.db", null, 1, "en_sc.zip", envN11, 15);
                    case 4:
                        Env envN12 = x.n();
                        m.f(context2, "context");
                        return new ao.a(context2, "es_sc.db", null, 1, "es_sc.zip", envN12, 10);
                    case 5:
                        Env envN13 = x.n();
                        m.f(context2, "context");
                        return new ao.a(context2, "fr_sc.db", null, 1, "fr_sc.zip", envN13, 27);
                    case 6:
                        Env envN14 = x.n();
                        m.f(context2, "context");
                        return new ao.a(context2, "de_sc.db", null, 1, ypOOxsaJG.CusfC, envN14, 18);
                    case 7:
                        Env envN15 = x.n();
                        m.f(context2, "context");
                        return new ao.a(context2, "vt_sc.db", null, 1, FpIL.tSESOlznfebZhR, envN15, 14);
                    case 8:
                        Env envN16 = x.n();
                        m.f(context2, "context");
                        return new ao.a(context2, "pt_sc.db", null, 1, "pt_sc.zip", envN16, 29);
                    default:
                        switch (i12) {
                            case 18:
                                Env envN17 = x.n();
                                m.f(context2, "context");
                                return new sl.a(context2, "idn_sc.db", null, 1, "idn_sc.zip", envN17, 1);
                            case 19:
                                Env envN18 = x.n();
                                m.f(context2, "context");
                                return new ao.a(context2, "pol_sc.db", null, 1, "pol_sc.zip", envN18, 21);
                            case 20:
                                Env envN19 = x.n();
                                m.f(context2, "context");
                                return new sl.a(context2, "it_sc.db", null, 1, "it_sc.zip", envN19, 17);
                            case 21:
                                Env envN20 = x.n();
                                m.f(context2, "context");
                                return new sl.a(context2, "tur_sc.db", null, 1, "tur_sc.zip", envN20, 4);
                            default:
                                throw new IllegalArgumentException();
                        }
                }
            case 3:
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                Env envN21 = x.n();
                Context context3 = this.f21029b;
                m.f(context3, "context");
                return new d(context3, "jp_hand_write.db", null, 1, "jp_hand_write.zip", envN21);
            case 4:
                return com.bumptech.glide.d.k(context);
            default:
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                Env envN22 = x.n();
                Context context4 = this.f21029b;
                m.f(context4, "context");
                return new oi.d(context4, "cn_hand_write.db", null, 1, "cn_hand_write.zip", envN22);
        }
    }
}
