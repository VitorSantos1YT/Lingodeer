package fr;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.MeDataFriendsUpdateResponse;
import com.lingodeer.network.model.ServerJsonResponse;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ApiResponse.Success f27430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v1 f27433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f27434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(v1 v1Var, String str, vy.d dVar) {
        super(2, dVar);
        this.f27433d = v1Var;
        this.f27434e = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        c1 c1Var = new c1(this.f27433d, this.f27434e, dVar);
        c1Var.f27432c = obj;
        return c1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c1) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x009f  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d0 A[PHI: r0
      0x00d0: PHI (r0v10 java.lang.Object) = (r0v5 java.lang.Object), (r0v14 java.lang.Object) binds: [B:22:0x00cc, B:8:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:33:0x010e A[PHI: r0
      0x010e: PHI (r0v17 java.lang.Object) = (r0v16 java.lang.Object), (r0v21 java.lang.Object) binds: [B:31:0x010b, B:6:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0113  */
    /* JADX WARN: Code duplicated, block: B:39:0x015a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x015b  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Object objV;
        Object obj2;
        vt.h1 h1Var;
        b1 b1Var;
        Boolean bool;
        uz.i1 i1Var;
        Object value;
        Object objU;
        LeaderBoardUser leaderBoardUser;
        Boolean bool2;
        v1 v1Var = this.f27433d;
        vt.c cVar = v1Var.f27912c;
        uz.j jVar = (uz.j) this.f27432c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f27431b;
        qy.b0 b0Var = qy.b0.f48488a;
        String str = this.f27434e;
        vy.d dVar = null;
        switch (i11) {
            case 0:
                com.bumptech.glide.e.F(obj);
                dv.u0 u0Var = v1Var.f27913d;
                String strW = ((o0) v1Var.f27910a).w();
                this.f27432c = jVar;
                this.f27431b = 1;
                JsonObject jsonObjectC = ep.a.c("uid", strW);
                jsonObjectC.add("followings_join", new Gson().toJsonTree(ns.o.K(str)));
                qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", b7.e0.i(u0Var, jsonObjectC, u0Var.f24526e));
                qy.l lVar = (qy.l) lVarY.f48496b;
                objV = u0Var.v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<MeDataFriendsUpdateResponse>>() { // from class: com.lingodeer.network.NetworkClient$followUser$2
                }, null, new dv.g0(u0Var, (JsonObject) lVarY.f48495a, dVar, 1), this);
                if (objV != aVar) {
                    obj2 = (ApiResponse) objV;
                    if (obj2 instanceof ApiResponse.Error) {
                        bool = Boolean.FALSE;
                        this.f27432c = null;
                        this.f27430a = null;
                        this.f27431b = 2;
                        if (jVar.emit(bool, this) == aVar) {
                            return b0Var;
                        }
                    } else {
                        if (obj2 instanceof ApiResponse.Success) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h1Var = v1Var.f27911b;
                        ApiResponse.Success success = (ApiResponse.Success) obj2;
                        b1Var = new b1(success, 0);
                        this.f27432c = jVar;
                        this.f27430a = success;
                        this.f27431b = 3;
                        if (((x4) h1Var).u(b1Var, this) != aVar) {
                            i1Var = v1Var.f27915f;
                            do {
                                value = i1Var.getValue();
                            } while (!i1Var.j(value, ((MeDataFriendsUpdateResponse) ((ApiResponse.Success) obj2).getData()).getAll_followings()));
                            this.f27432c = jVar;
                            this.f27430a = null;
                            this.f27431b = 4;
                            ((vt.d) cVar).n(this);
                            if (b0Var != aVar) {
                                gp.r rVarC = v1Var.c(str);
                                this.f27432c = jVar;
                                this.f27430a = null;
                                this.f27431b = 5;
                                objU = uz.x0.u(rVarC, this);
                                if (objU != aVar) {
                                    leaderBoardUser = (LeaderBoardUser) objU;
                                    if (leaderBoardUser != null) {
                                        ((vt.d) cVar).m(LeaderBoardUser.copy$default(leaderBoardUser, null, 0, 0, null, null, null, null, null, null, false, true, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                                    }
                                    bool2 = Boolean.TRUE;
                                    this.f27432c = null;
                                    this.f27430a = null;
                                    this.f27431b = 6;
                                    if (jVar.emit(bool2, this) == aVar) {
                                        return b0Var;
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                com.bumptech.glide.e.F(obj);
                objV = obj;
                obj2 = (ApiResponse) objV;
                if (obj2 instanceof ApiResponse.Error) {
                    bool = Boolean.FALSE;
                    this.f27432c = null;
                    this.f27430a = null;
                    this.f27431b = 2;
                    if (jVar.emit(bool, this) == aVar) {
                        return b0Var;
                    }
                } else {
                    if (obj2 instanceof ApiResponse.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h1Var = v1Var.f27911b;
                    ApiResponse.Success success2 = (ApiResponse.Success) obj2;
                    b1Var = new b1(success2, 0);
                    this.f27432c = jVar;
                    this.f27430a = success2;
                    this.f27431b = 3;
                    if (((x4) h1Var).u(b1Var, this) != aVar) {
                        i1Var = v1Var.f27915f;
                        do {
                            value = i1Var.getValue();
                        } while (!i1Var.j(value, ((MeDataFriendsUpdateResponse) ((ApiResponse.Success) obj2).getData()).getAll_followings()));
                        this.f27432c = jVar;
                        this.f27430a = null;
                        this.f27431b = 4;
                        ((vt.d) cVar).n(this);
                        if (b0Var != aVar) {
                            gp.r rVarC2 = v1Var.c(str);
                            this.f27432c = jVar;
                            this.f27430a = null;
                            this.f27431b = 5;
                            objU = uz.x0.u(rVarC2, this);
                            if (objU != aVar) {
                                leaderBoardUser = (LeaderBoardUser) objU;
                                if (leaderBoardUser != null) {
                                    ((vt.d) cVar).m(LeaderBoardUser.copy$default(leaderBoardUser, null, 0, 0, null, null, null, null, null, null, false, true, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                                }
                                bool2 = Boolean.TRUE;
                                this.f27432c = null;
                                this.f27430a = null;
                                this.f27431b = 6;
                                if (jVar.emit(bool2, this) == aVar) {
                                    return b0Var;
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 2:
            case 6:
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 3:
                obj2 = this.f27430a;
                com.bumptech.glide.e.F(obj);
                i1Var = v1Var.f27915f;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, ((MeDataFriendsUpdateResponse) ((ApiResponse.Success) obj2).getData()).getAll_followings()));
                this.f27432c = jVar;
                this.f27430a = null;
                this.f27431b = 4;
                ((vt.d) cVar).n(this);
                if (b0Var != aVar) {
                    gp.r rVarC3 = v1Var.c(str);
                    this.f27432c = jVar;
                    this.f27430a = null;
                    this.f27431b = 5;
                    objU = uz.x0.u(rVarC3, this);
                    if (objU != aVar) {
                        leaderBoardUser = (LeaderBoardUser) objU;
                        if (leaderBoardUser != null) {
                            ((vt.d) cVar).m(LeaderBoardUser.copy$default(leaderBoardUser, null, 0, 0, null, null, null, null, null, null, false, true, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                        }
                        bool2 = Boolean.TRUE;
                        this.f27432c = null;
                        this.f27430a = null;
                        this.f27431b = 6;
                        if (jVar.emit(bool2, this) == aVar) {
                            return b0Var;
                        }
                    }
                }
                return aVar;
            case 4:
                com.bumptech.glide.e.F(obj);
                gp.r rVarC4 = v1Var.c(str);
                this.f27432c = jVar;
                this.f27430a = null;
                this.f27431b = 5;
                objU = uz.x0.u(rVarC4, this);
                if (objU != aVar) {
                    leaderBoardUser = (LeaderBoardUser) objU;
                    if (leaderBoardUser != null) {
                        ((vt.d) cVar).m(LeaderBoardUser.copy$default(leaderBoardUser, null, 0, 0, null, null, null, null, null, null, false, true, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                    }
                    bool2 = Boolean.TRUE;
                    this.f27432c = null;
                    this.f27430a = null;
                    this.f27431b = 6;
                    if (jVar.emit(bool2, this) == aVar) {
                        return b0Var;
                    }
                }
                return aVar;
            case 5:
                com.bumptech.glide.e.F(obj);
                objU = obj;
                leaderBoardUser = (LeaderBoardUser) objU;
                if (leaderBoardUser != null) {
                    ((vt.d) cVar).m(LeaderBoardUser.copy$default(leaderBoardUser, null, 0, 0, null, null, null, null, null, null, false, true, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                }
                bool2 = Boolean.TRUE;
                this.f27432c = null;
                this.f27430a = null;
                this.f27431b = 6;
                if (jVar.emit(bool2, this) == aVar) {
                    return aVar;
                }
                return b0Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
