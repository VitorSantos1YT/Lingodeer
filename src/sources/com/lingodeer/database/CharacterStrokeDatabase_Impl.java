package com.lingodeer.database;

import au.p;
import com.bumptech.glide.d;
import com.lingodeer.database.CharacterStrokeDatabase_Impl;
import fz.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.z;
import qy.q;
import ry.r;
import v5.e;
import w9.g;
import yt.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CharacterStrokeDatabase_Impl extends CharacterStrokeDatabase {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f22330p = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f22331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q f22332o;

    public CharacterStrokeDatabase_Impl() {
        final int i11 = 0;
        this.f22331n = d.v(new a(this) { // from class: yt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CharacterStrokeDatabase_Impl f58350b;

            {
                this.f58350b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                int i12 = i11;
                CharacterStrokeDatabase_Impl characterStrokeDatabase_Impl = this.f58350b;
                switch (i12) {
                    case 0:
                        int i13 = CharacterStrokeDatabase_Impl.f22330p;
                        return new p(characterStrokeDatabase_Impl);
                    default:
                        int i14 = CharacterStrokeDatabase_Impl.f22330p;
                        return new au.q(characterStrokeDatabase_Impl);
                }
            }
        });
        final int i12 = 1;
        this.f22332o = d.v(new a(this) { // from class: yt.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CharacterStrokeDatabase_Impl f58350b;

            {
                this.f58350b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                int i13 = i12;
                CharacterStrokeDatabase_Impl characterStrokeDatabase_Impl = this.f58350b;
                switch (i13) {
                    case 0:
                        int i14 = CharacterStrokeDatabase_Impl.f22330p;
                        return new p(characterStrokeDatabase_Impl);
                    default:
                        int i15 = CharacterStrokeDatabase_Impl.f22330p;
                        return new au.q(characterStrokeDatabase_Impl);
                }
            }
        });
    }

    @Override // com.lingodeer.database.CharacterStrokeDatabase
    public final au.q A() {
        return (au.q) this.f22332o.getValue();
    }

    @Override // w9.s
    public final List f(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // w9.s
    public final g g() {
        return new g(this, new LinkedHashMap(), new LinkedHashMap(), "CharacterStroke", "CharacterStrokeGroup");
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
        kotlin.jvm.internal.e eVarA = z.a(p.class);
        r rVar = r.f50854a;
        linkedHashMap.put(eVarA, rVar);
        linkedHashMap.put(z.a(au.q.class), rVar);
        return linkedHashMap;
    }

    @Override // com.lingodeer.database.CharacterStrokeDatabase
    public final p z() {
        return (p) this.f22331n.getValue();
    }
}
