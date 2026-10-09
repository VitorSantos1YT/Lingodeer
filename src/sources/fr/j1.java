package fr;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.lingodeer.data.model.UserInfo;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.LeaderBoardResponse;
import com.lingodeer.network.model.ServerJsonResponse;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ApiResponse f27624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public uz.j f27625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f27628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v1 f27629f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(v1 v1Var, vy.d dVar) {
        super(2, dVar);
        this.f27629f = v1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        j1 j1Var = new j1(this.f27629f, dVar);
        j1Var.f27628e = obj;
        return j1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x0125 A[PHI: r0 r14
      0x0125: PHI (r0v25 java.lang.Object) = (r0v21 java.lang.Object), (r0v29 java.lang.Object) binds: [B:41:0x0121, B:14:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r14v1 int) = (r14v0 int), (r14v2 int) binds: [B:41:0x0121, B:14:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0145  */
    /* JADX WARN: Code duplicated, block: B:49:0x014a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0155  */
    /* JADX WARN: Code duplicated, block: B:55:0x0170  */
    /* JADX WARN: Code duplicated, block: B:60:0x0179  */
    /* JADX WARN: Code duplicated, block: B:63:0x018d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0191  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e2 A[PHI: r0 r1 r2
      0x01e2: PHI (r0v37 int) = (r0v32 int), (r0v38 int) binds: [B:69:0x01df, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r1v23 com.lingodeer.network.model.ApiResponse) = (r1v20 com.lingodeer.network.model.ApiResponse), (r1v28 com.lingodeer.network.model.ApiResponse) binds: [B:69:0x01df, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r2v33 java.lang.Object) = (r2v31 java.lang.Object), (r2v45 java.lang.Object) binds: [B:69:0x01df, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0246 A[PHI: r0 r1 r9
      0x0246: PHI (r0v39 int) = (r0v37 int), (r0v42 int) binds: [B:72:0x0243, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r1v29 java.lang.Object) = (r1v27 java.lang.Object), (r1v30 java.lang.Object) binds: [B:72:0x0243, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r9v2 uz.j) = (r9v1 uz.j), (r9v3 uz.j) binds: [B:72:0x0243, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0258 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x0259 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x025a  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Object objU;
        int totalXP;
        Object objV;
        LeaderBoardUiState.Locked locked;
        ApiResponse apiResponse;
        Object objM;
        ApiResponse apiResponse2;
        int i11;
        o0 o0Var;
        Object objM2;
        String str;
        Object objM3;
        LeaderBoardUiState.Loading loading;
        Object objM4;
        v1 v1Var = this.f27629f;
        vt.n0 n0Var = v1Var.f27910a;
        uz.j jVar = (uz.j) this.f27628e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f27627d;
        int i13 = 3;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        switch (i12) {
            case 0:
                com.bumptech.glide.e.F(obj);
                if (((o0) n0Var).f27733a.isUnloginUser()) {
                    LeaderBoardUiState.NeedLogin needLogin = LeaderBoardUiState.NeedLogin.INSTANCE;
                    this.f27628e = null;
                    this.f27627d = 1;
                    if (jVar.emit(needLogin, this) == aVar) {
                        return aVar;
                    }
                    return b0Var;
                }
                if (((o0) n0Var).f27733a.showLeaderBoard) {
                    gp.r rVarN = ((x4) v1Var.f27911b).n();
                    this.f27628e = jVar;
                    this.f27627d = 3;
                    objU = uz.x0.u(rVarN, this);
                    if (objU != aVar) {
                        totalXP = ((UserInfo) objU).getTotalXP();
                        if (totalXP == 0) {
                            locked = LeaderBoardUiState.Locked.INSTANCE;
                            this.f27628e = null;
                            this.f27626c = totalXP;
                            this.f27627d = 4;
                            if (jVar.emit(locked, this) == aVar) {
                                return b0Var;
                            }
                        } else {
                            dv.u0 u0Var = v1Var.f27913d;
                            String strW = ((o0) n0Var).w();
                            this.f27628e = jVar;
                            this.f27626c = totalXP;
                            this.f27627d = 5;
                            JsonObject jsonObjectC = ep.a.c("uid", strW);
                            jsonObjectC.add(u0Var.f24526e, u0Var.c());
                            jsonObjectC.add(u0Var.f24527f, dv.u0.b());
                            qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", u0Var.a());
                            qy.l lVar = (qy.l) lVarY.f48496b;
                            objV = u0Var.v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<LeaderBoardResponse>>() { // from class: com.lingodeer.network.NetworkClient$userLeaderboardRetrivalMyGroup$2
                            }, null, new dv.p0(u0Var, (JsonObject) lVarY.f48495a, dVar, 18), this);
                            if (objV != aVar) {
                                apiResponse = (ApiResponse) objV;
                                this.f27628e = jVar;
                                this.f27624a = apiResponse;
                                this.f27626c = totalXP;
                                this.f27627d = 6;
                                yz.f fVar = rz.o0.f50940a;
                                objM = rz.e0.M(yz.e.f58387a, new f0(totalXP, 24, (o0) n0Var, dVar), this);
                                if (objM != aVar) {
                                    objM = b0Var;
                                }
                                if (objM != aVar) {
                                    apiResponse2 = apiResponse;
                                    i11 = totalXP;
                                    o0Var = (o0) n0Var;
                                    if (!o0Var.f27733a.hasUploadedXP) {
                                        this.f27628e = jVar;
                                        this.f27624a = apiResponse2;
                                        this.f27626c = i11;
                                        this.f27627d = 7;
                                        yz.f fVar2 = rz.o0.f50940a;
                                        objM2 = rz.e0.M(yz.e.f58387a, new g0(13, o0Var, dVar), this);
                                        if (objM2 != aVar) {
                                            objM2 = b0Var;
                                        }
                                        if (objM2 != aVar) {
                                        }
                                    }
                                    if (apiResponse2 instanceof ApiResponse.Error) {
                                        loading = LeaderBoardUiState.Loading.INSTANCE;
                                        this.f27628e = null;
                                        this.f27624a = null;
                                        this.f27626c = i11;
                                        this.f27627d = 8;
                                        if (jVar.emit(loading, this) != aVar) {
                                            return b0Var;
                                        }
                                    } else {
                                        if (!(apiResponse2 instanceof ApiResponse.Success)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        LeaderBoardResponse leaderBoardResponse = (LeaderBoardResponse) ((ApiResponse.Success) apiResponse2).getData();
                                        String strW2 = ((o0) n0Var).w();
                                        str = ((o0) n0Var).f27733a.userPicName;
                                        if (str == null) {
                                            str = BuildConfig.VERSION_NAME;
                                        }
                                        String str2 = str;
                                        String strQ = ((o0) n0Var).q();
                                        bp.j jVar2 = new bp.j(v1Var, dVar, i13);
                                        bp.h2 h2Var = new bp.h2(v1Var, null);
                                        this.f27628e = jVar;
                                        this.f27624a = apiResponse2;
                                        this.f27626c = i11;
                                        this.f27627d = 9;
                                        oz.o oVar = x1.f27961a;
                                        yz.f fVar3 = rz.o0.f50940a;
                                        objM3 = rz.e0.M(yz.e.f58387a, new w1(leaderBoardResponse, strW2, str2, strQ, jVar2, h2Var, null), this);
                                        if (objM3 != aVar) {
                                            qy.l lVar2 = (qy.l) objM3;
                                            List list = (List) lVar2.f48495a;
                                            List list2 = (List) lVar2.f48496b;
                                            String strW3 = ((o0) n0Var).w();
                                            String todayRank = ((o0) n0Var).f27733a.todayRank;
                                            kotlin.jvm.internal.m.e(todayRank, "todayRank");
                                            ApiResponse.Success success = (ApiResponse.Success) apiResponse2;
                                            String curUserWeekName = ((LeaderBoardResponse) success.getData()).getCurUserWeekName();
                                            String curUserLevel = ((LeaderBoardResponse) success.getData()).getCurUserLevel();
                                            h1 h1Var = new h1(v1Var, dVar, 0);
                                            i1 i1Var = new i1(v1Var, apiResponse2, null);
                                            this.f27628e = null;
                                            this.f27624a = null;
                                            this.f27625b = jVar;
                                            this.f27626c = i11;
                                            this.f27627d = 10;
                                            yz.f fVar4 = rz.o0.f50940a;
                                            objM4 = rz.e0.M(yz.e.f58387a, new tu.n0(todayRank, h1Var, curUserLevel, list, list2, strW3, i1Var, curUserWeekName, null), this);
                                            if (objM4 != aVar) {
                                                this.f27628e = null;
                                                this.f27624a = null;
                                                this.f27625b = null;
                                                this.f27626c = i11;
                                                this.f27627d = 11;
                                                if (jVar.emit(objM4, this) == aVar) {
                                                    return b0Var;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    LeaderBoardUiState.Hide hide = LeaderBoardUiState.Hide.INSTANCE;
                    this.f27628e = null;
                    this.f27627d = 2;
                    if (jVar.emit(hide, this) != aVar) {
                        return b0Var;
                    }
                }
                return aVar;
            case 1:
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 2:
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 3:
                com.bumptech.glide.e.F(obj);
                objU = obj;
                totalXP = ((UserInfo) objU).getTotalXP();
                if (totalXP == 0) {
                    locked = LeaderBoardUiState.Locked.INSTANCE;
                    this.f27628e = null;
                    this.f27626c = totalXP;
                    this.f27627d = 4;
                    if (jVar.emit(locked, this) == aVar) {
                        return b0Var;
                    }
                } else {
                    dv.u0 u0Var2 = v1Var.f27913d;
                    String strW4 = ((o0) n0Var).w();
                    this.f27628e = jVar;
                    this.f27626c = totalXP;
                    this.f27627d = 5;
                    JsonObject jsonObjectC2 = ep.a.c("uid", strW4);
                    jsonObjectC2.add(u0Var2.f24526e, u0Var2.c());
                    jsonObjectC2.add(u0Var2.f24527f, dv.u0.b());
                    qy.l lVarY2 = nv.p.y(jsonObjectC2, "toJson(...)", u0Var2.a());
                    qy.l lVar3 = (qy.l) lVarY2.f48496b;
                    objV = u0Var2.v((SecretKey) lVar3.f48495a, (SecretKey) lVar3.f48496b, new TypeToken<ServerJsonResponse<LeaderBoardResponse>>() { // from class: com.lingodeer.network.NetworkClient$userLeaderboardRetrivalMyGroup$2
                    }, null, new dv.p0(u0Var2, (JsonObject) lVarY2.f48495a, dVar, 18), this);
                    if (objV != aVar) {
                        apiResponse = (ApiResponse) objV;
                        this.f27628e = jVar;
                        this.f27624a = apiResponse;
                        this.f27626c = totalXP;
                        this.f27627d = 6;
                        yz.f fVar5 = rz.o0.f50940a;
                        objM = rz.e0.M(yz.e.f58387a, new f0(totalXP, 24, (o0) n0Var, dVar), this);
                        if (objM != aVar) {
                            objM = b0Var;
                        }
                        if (objM != aVar) {
                            apiResponse2 = apiResponse;
                            i11 = totalXP;
                            o0Var = (o0) n0Var;
                            if (!o0Var.f27733a.hasUploadedXP) {
                                this.f27628e = jVar;
                                this.f27624a = apiResponse2;
                                this.f27626c = i11;
                                this.f27627d = 7;
                                yz.f fVar6 = rz.o0.f50940a;
                                objM2 = rz.e0.M(yz.e.f58387a, new g0(13, o0Var, dVar), this);
                                if (objM2 != aVar) {
                                    objM2 = b0Var;
                                }
                                if (objM2 != aVar) {
                                }
                            }
                            if (apiResponse2 instanceof ApiResponse.Error) {
                                loading = LeaderBoardUiState.Loading.INSTANCE;
                                this.f27628e = null;
                                this.f27624a = null;
                                this.f27626c = i11;
                                this.f27627d = 8;
                                if (jVar.emit(loading, this) != aVar) {
                                    return b0Var;
                                }
                            } else {
                                if (!(apiResponse2 instanceof ApiResponse.Success)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                LeaderBoardResponse leaderBoardResponse2 = (LeaderBoardResponse) ((ApiResponse.Success) apiResponse2).getData();
                                String strW5 = ((o0) n0Var).w();
                                str = ((o0) n0Var).f27733a.userPicName;
                                if (str == null) {
                                    str = BuildConfig.VERSION_NAME;
                                }
                                String str3 = str;
                                String strQ2 = ((o0) n0Var).q();
                                bp.j jVar3 = new bp.j(v1Var, dVar, i13);
                                bp.h2 h2Var2 = new bp.h2(v1Var, null);
                                this.f27628e = jVar;
                                this.f27624a = apiResponse2;
                                this.f27626c = i11;
                                this.f27627d = 9;
                                oz.o oVar2 = x1.f27961a;
                                yz.f fVar7 = rz.o0.f50940a;
                                objM3 = rz.e0.M(yz.e.f58387a, new w1(leaderBoardResponse2, strW5, str3, strQ2, jVar3, h2Var2, null), this);
                                if (objM3 != aVar) {
                                    qy.l lVar4 = (qy.l) objM3;
                                    List list3 = (List) lVar4.f48495a;
                                    List list4 = (List) lVar4.f48496b;
                                    String strW6 = ((o0) n0Var).w();
                                    String todayRank2 = ((o0) n0Var).f27733a.todayRank;
                                    kotlin.jvm.internal.m.e(todayRank2, "todayRank");
                                    ApiResponse.Success success2 = (ApiResponse.Success) apiResponse2;
                                    String curUserWeekName2 = ((LeaderBoardResponse) success2.getData()).getCurUserWeekName();
                                    String curUserLevel2 = ((LeaderBoardResponse) success2.getData()).getCurUserLevel();
                                    h1 h1Var2 = new h1(v1Var, dVar, 0);
                                    i1 i1Var2 = new i1(v1Var, apiResponse2, null);
                                    this.f27628e = null;
                                    this.f27624a = null;
                                    this.f27625b = jVar;
                                    this.f27626c = i11;
                                    this.f27627d = 10;
                                    yz.f fVar8 = rz.o0.f50940a;
                                    objM4 = rz.e0.M(yz.e.f58387a, new tu.n0(todayRank2, h1Var2, curUserLevel2, list3, list4, strW6, i1Var2, curUserWeekName2, null), this);
                                    if (objM4 != aVar) {
                                        this.f27628e = null;
                                        this.f27624a = null;
                                        this.f27625b = null;
                                        this.f27626c = i11;
                                        this.f27627d = 11;
                                        if (jVar.emit(objM4, this) == aVar) {
                                            return b0Var;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 4:
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 5:
                int i14 = this.f27626c;
                com.bumptech.glide.e.F(obj);
                totalXP = i14;
                objV = obj;
                apiResponse = (ApiResponse) objV;
                this.f27628e = jVar;
                this.f27624a = apiResponse;
                this.f27626c = totalXP;
                this.f27627d = 6;
                yz.f fVar9 = rz.o0.f50940a;
                objM = rz.e0.M(yz.e.f58387a, new f0(totalXP, 24, (o0) n0Var, dVar), this);
                if (objM != aVar) {
                    objM = b0Var;
                }
                if (objM != aVar) {
                    apiResponse2 = apiResponse;
                    i11 = totalXP;
                    o0Var = (o0) n0Var;
                    if (!o0Var.f27733a.hasUploadedXP) {
                        this.f27628e = jVar;
                        this.f27624a = apiResponse2;
                        this.f27626c = i11;
                        this.f27627d = 7;
                        yz.f fVar10 = rz.o0.f50940a;
                        objM2 = rz.e0.M(yz.e.f58387a, new g0(13, o0Var, dVar), this);
                        if (objM2 != aVar) {
                            objM2 = b0Var;
                        }
                        if (objM2 != aVar) {
                        }
                    }
                    if (apiResponse2 instanceof ApiResponse.Error) {
                        loading = LeaderBoardUiState.Loading.INSTANCE;
                        this.f27628e = null;
                        this.f27624a = null;
                        this.f27626c = i11;
                        this.f27627d = 8;
                        if (jVar.emit(loading, this) != aVar) {
                            return b0Var;
                        }
                    } else {
                        if (!(apiResponse2 instanceof ApiResponse.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        LeaderBoardResponse leaderBoardResponse3 = (LeaderBoardResponse) ((ApiResponse.Success) apiResponse2).getData();
                        String strW7 = ((o0) n0Var).w();
                        str = ((o0) n0Var).f27733a.userPicName;
                        if (str == null) {
                            str = BuildConfig.VERSION_NAME;
                        }
                        String str4 = str;
                        String strQ3 = ((o0) n0Var).q();
                        bp.j jVar4 = new bp.j(v1Var, dVar, i13);
                        bp.h2 h2Var3 = new bp.h2(v1Var, null);
                        this.f27628e = jVar;
                        this.f27624a = apiResponse2;
                        this.f27626c = i11;
                        this.f27627d = 9;
                        oz.o oVar3 = x1.f27961a;
                        yz.f fVar11 = rz.o0.f50940a;
                        objM3 = rz.e0.M(yz.e.f58387a, new w1(leaderBoardResponse3, strW7, str4, strQ3, jVar4, h2Var3, null), this);
                        if (objM3 != aVar) {
                            qy.l lVar5 = (qy.l) objM3;
                            List list5 = (List) lVar5.f48495a;
                            List list6 = (List) lVar5.f48496b;
                            String strW8 = ((o0) n0Var).w();
                            String todayRank3 = ((o0) n0Var).f27733a.todayRank;
                            kotlin.jvm.internal.m.e(todayRank3, "todayRank");
                            ApiResponse.Success success3 = (ApiResponse.Success) apiResponse2;
                            String curUserWeekName3 = ((LeaderBoardResponse) success3.getData()).getCurUserWeekName();
                            String curUserLevel3 = ((LeaderBoardResponse) success3.getData()).getCurUserLevel();
                            h1 h1Var3 = new h1(v1Var, dVar, 0);
                            i1 i1Var3 = new i1(v1Var, apiResponse2, null);
                            this.f27628e = null;
                            this.f27624a = null;
                            this.f27625b = jVar;
                            this.f27626c = i11;
                            this.f27627d = 10;
                            yz.f fVar12 = rz.o0.f50940a;
                            objM4 = rz.e0.M(yz.e.f58387a, new tu.n0(todayRank3, h1Var3, curUserLevel3, list5, list6, strW8, i1Var3, curUserWeekName3, null), this);
                            if (objM4 != aVar) {
                                this.f27628e = null;
                                this.f27624a = null;
                                this.f27625b = null;
                                this.f27626c = i11;
                                this.f27627d = 11;
                                if (jVar.emit(objM4, this) == aVar) {
                                    return b0Var;
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 6:
                i11 = this.f27626c;
                apiResponse2 = this.f27624a;
                com.bumptech.glide.e.F(obj);
                o0Var = (o0) n0Var;
                if (!o0Var.f27733a.hasUploadedXP) {
                    this.f27628e = jVar;
                    this.f27624a = apiResponse2;
                    this.f27626c = i11;
                    this.f27627d = 7;
                    yz.f fVar13 = rz.o0.f50940a;
                    objM2 = rz.e0.M(yz.e.f58387a, new g0(13, o0Var, dVar), this);
                    if (objM2 != aVar) {
                        objM2 = b0Var;
                    }
                    if (objM2 != aVar) {
                    }
                    return aVar;
                }
                if (apiResponse2 instanceof ApiResponse.Error) {
                    loading = LeaderBoardUiState.Loading.INSTANCE;
                    this.f27628e = null;
                    this.f27624a = null;
                    this.f27626c = i11;
                    this.f27627d = 8;
                    if (jVar.emit(loading, this) != aVar) {
                        return b0Var;
                    }
                } else {
                    if (!(apiResponse2 instanceof ApiResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LeaderBoardResponse leaderBoardResponse4 = (LeaderBoardResponse) ((ApiResponse.Success) apiResponse2).getData();
                    String strW9 = ((o0) n0Var).w();
                    str = ((o0) n0Var).f27733a.userPicName;
                    if (str == null) {
                        str = BuildConfig.VERSION_NAME;
                    }
                    String str5 = str;
                    String strQ4 = ((o0) n0Var).q();
                    bp.j jVar5 = new bp.j(v1Var, dVar, i13);
                    bp.h2 h2Var4 = new bp.h2(v1Var, null);
                    this.f27628e = jVar;
                    this.f27624a = apiResponse2;
                    this.f27626c = i11;
                    this.f27627d = 9;
                    oz.o oVar4 = x1.f27961a;
                    yz.f fVar14 = rz.o0.f50940a;
                    objM3 = rz.e0.M(yz.e.f58387a, new w1(leaderBoardResponse4, strW9, str5, strQ4, jVar5, h2Var4, null), this);
                    if (objM3 != aVar) {
                        qy.l lVar6 = (qy.l) objM3;
                        List list7 = (List) lVar6.f48495a;
                        List list8 = (List) lVar6.f48496b;
                        String strW10 = ((o0) n0Var).w();
                        String todayRank4 = ((o0) n0Var).f27733a.todayRank;
                        kotlin.jvm.internal.m.e(todayRank4, "todayRank");
                        ApiResponse.Success success4 = (ApiResponse.Success) apiResponse2;
                        String curUserWeekName4 = ((LeaderBoardResponse) success4.getData()).getCurUserWeekName();
                        String curUserLevel4 = ((LeaderBoardResponse) success4.getData()).getCurUserLevel();
                        h1 h1Var4 = new h1(v1Var, dVar, 0);
                        i1 i1Var4 = new i1(v1Var, apiResponse2, null);
                        this.f27628e = null;
                        this.f27624a = null;
                        this.f27625b = jVar;
                        this.f27626c = i11;
                        this.f27627d = 10;
                        yz.f fVar15 = rz.o0.f50940a;
                        objM4 = rz.e0.M(yz.e.f58387a, new tu.n0(todayRank4, h1Var4, curUserLevel4, list7, list8, strW10, i1Var4, curUserWeekName4, null), this);
                        if (objM4 != aVar) {
                            this.f27628e = null;
                            this.f27624a = null;
                            this.f27625b = null;
                            this.f27626c = i11;
                            this.f27627d = 11;
                            if (jVar.emit(objM4, this) == aVar) {
                                return b0Var;
                            }
                        }
                    }
                }
                return aVar;
            case 7:
                i11 = this.f27626c;
                apiResponse2 = this.f27624a;
                com.bumptech.glide.e.F(obj);
                if (apiResponse2 instanceof ApiResponse.Error) {
                    loading = LeaderBoardUiState.Loading.INSTANCE;
                    this.f27628e = null;
                    this.f27624a = null;
                    this.f27626c = i11;
                    this.f27627d = 8;
                    if (jVar.emit(loading, this) != aVar) {
                        return b0Var;
                    }
                } else {
                    if (!(apiResponse2 instanceof ApiResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LeaderBoardResponse leaderBoardResponse5 = (LeaderBoardResponse) ((ApiResponse.Success) apiResponse2).getData();
                    String strW11 = ((o0) n0Var).w();
                    str = ((o0) n0Var).f27733a.userPicName;
                    if (str == null) {
                        str = BuildConfig.VERSION_NAME;
                    }
                    String str6 = str;
                    String strQ5 = ((o0) n0Var).q();
                    bp.j jVar6 = new bp.j(v1Var, dVar, i13);
                    bp.h2 h2Var5 = new bp.h2(v1Var, null);
                    this.f27628e = jVar;
                    this.f27624a = apiResponse2;
                    this.f27626c = i11;
                    this.f27627d = 9;
                    oz.o oVar5 = x1.f27961a;
                    yz.f fVar16 = rz.o0.f50940a;
                    objM3 = rz.e0.M(yz.e.f58387a, new w1(leaderBoardResponse5, strW11, str6, strQ5, jVar6, h2Var5, null), this);
                    if (objM3 != aVar) {
                        qy.l lVar7 = (qy.l) objM3;
                        List list9 = (List) lVar7.f48495a;
                        List list10 = (List) lVar7.f48496b;
                        String strW12 = ((o0) n0Var).w();
                        String todayRank5 = ((o0) n0Var).f27733a.todayRank;
                        kotlin.jvm.internal.m.e(todayRank5, "todayRank");
                        ApiResponse.Success success5 = (ApiResponse.Success) apiResponse2;
                        String curUserWeekName5 = ((LeaderBoardResponse) success5.getData()).getCurUserWeekName();
                        String curUserLevel5 = ((LeaderBoardResponse) success5.getData()).getCurUserLevel();
                        h1 h1Var5 = new h1(v1Var, dVar, 0);
                        i1 i1Var5 = new i1(v1Var, apiResponse2, null);
                        this.f27628e = null;
                        this.f27624a = null;
                        this.f27625b = jVar;
                        this.f27626c = i11;
                        this.f27627d = 10;
                        yz.f fVar17 = rz.o0.f50940a;
                        objM4 = rz.e0.M(yz.e.f58387a, new tu.n0(todayRank5, h1Var5, curUserLevel5, list9, list10, strW12, i1Var5, curUserWeekName5, null), this);
                        if (objM4 != aVar) {
                            this.f27628e = null;
                            this.f27624a = null;
                            this.f27625b = null;
                            this.f27626c = i11;
                            this.f27627d = 11;
                            if (jVar.emit(objM4, this) == aVar) {
                                return b0Var;
                            }
                        }
                    }
                }
                return aVar;
            case 8:
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 9:
                i11 = this.f27626c;
                apiResponse2 = this.f27624a;
                com.bumptech.glide.e.F(obj);
                objM3 = obj;
                qy.l lVar8 = (qy.l) objM3;
                List list11 = (List) lVar8.f48495a;
                List list12 = (List) lVar8.f48496b;
                String strW13 = ((o0) n0Var).w();
                String todayRank6 = ((o0) n0Var).f27733a.todayRank;
                kotlin.jvm.internal.m.e(todayRank6, "todayRank");
                ApiResponse.Success success6 = (ApiResponse.Success) apiResponse2;
                String curUserWeekName6 = ((LeaderBoardResponse) success6.getData()).getCurUserWeekName();
                String curUserLevel6 = ((LeaderBoardResponse) success6.getData()).getCurUserLevel();
                h1 h1Var6 = new h1(v1Var, dVar, 0);
                i1 i1Var6 = new i1(v1Var, apiResponse2, null);
                this.f27628e = null;
                this.f27624a = null;
                this.f27625b = jVar;
                this.f27626c = i11;
                this.f27627d = 10;
                yz.f fVar18 = rz.o0.f50940a;
                objM4 = rz.e0.M(yz.e.f58387a, new tu.n0(todayRank6, h1Var6, curUserLevel6, list11, list12, strW13, i1Var6, curUserWeekName6, null), this);
                if (objM4 != aVar) {
                    this.f27628e = null;
                    this.f27624a = null;
                    this.f27625b = null;
                    this.f27626c = i11;
                    this.f27627d = 11;
                    if (jVar.emit(objM4, this) == aVar) {
                        return b0Var;
                    }
                }
                return aVar;
            case 10:
                i11 = this.f27626c;
                jVar = this.f27625b;
                com.bumptech.glide.e.F(obj);
                objM4 = obj;
                this.f27628e = null;
                this.f27624a = null;
                this.f27625b = null;
                this.f27626c = i11;
                this.f27627d = 11;
                if (jVar.emit(objM4, this) == aVar) {
                    return aVar;
                }
                return b0Var;
            case 11:
                com.bumptech.glide.e.F(obj);
                return b0Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
