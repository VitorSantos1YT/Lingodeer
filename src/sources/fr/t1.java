package fr;

import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.MeDataFriendsUpdateResponse;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ApiResponse.Success f27849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v1 f27852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f27853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(v1 v1Var, String str, vy.d dVar) {
        super(2, dVar);
        this.f27852d = v1Var;
        this.f27853e = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        t1 t1Var = new t1(this.f27852d, this.f27853e, dVar);
        t1Var.f27851c = obj;
        return t1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t1) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x008c A[PHI: r5
      0x008c: PHI (r5v6 java.lang.Object) = (r5v4 java.lang.Object), (r5v10 java.lang.Object) binds: [B:22:0x0088, B:8:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca A[PHI: r1
      0x00ca: PHI (r1v6 java.lang.Object) = (r1v5 java.lang.Object), (r1v10 java.lang.Object) binds: [B:31:0x00c7, B:6:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0112  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Object objX;
        Object obj2;
        vt.h1 h1Var;
        b1 b1Var;
        Boolean bool;
        uz.i1 i1Var;
        Object value;
        Object objU;
        LeaderBoardUser leaderBoardUser;
        Boolean bool2;
        v1 v1Var = this.f27852d;
        vt.c cVar = v1Var.f27912c;
        uz.j jVar = (uz.j) this.f27851c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f27850b;
        qy.b0 b0Var = qy.b0.f48488a;
        String str = this.f27853e;
        switch (i11) {
            case 0:
                com.bumptech.glide.e.F(obj);
                dv.u0 u0Var = v1Var.f27913d;
                String strW = ((o0) v1Var.f27910a).w();
                this.f27851c = jVar;
                this.f27850b = 1;
                objX = u0Var.x(strW, str, this);
                if (objX != aVar) {
                    obj2 = (ApiResponse) objX;
                    if (obj2 instanceof ApiResponse.Error) {
                        bool = Boolean.FALSE;
                        this.f27851c = null;
                        this.f27849a = null;
                        this.f27850b = 2;
                        if (jVar.emit(bool, this) == aVar) {
                            return b0Var;
                        }
                    } else {
                        if (obj2 instanceof ApiResponse.Success) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h1Var = v1Var.f27911b;
                        ApiResponse.Success success = (ApiResponse.Success) obj2;
                        b1Var = new b1(success, 1);
                        this.f27851c = jVar;
                        this.f27849a = success;
                        this.f27850b = 3;
                        if (((x4) h1Var).u(b1Var, this) != aVar) {
                            i1Var = v1Var.f27915f;
                            do {
                                value = i1Var.getValue();
                            } while (!i1Var.j(value, ((MeDataFriendsUpdateResponse) ((ApiResponse.Success) obj2).getData()).getAll_followings()));
                            this.f27851c = jVar;
                            this.f27849a = null;
                            this.f27850b = 4;
                            ((vt.d) cVar).n(this);
                            if (b0Var != aVar) {
                                gp.r rVarC = v1Var.c(str);
                                this.f27851c = jVar;
                                this.f27849a = null;
                                this.f27850b = 5;
                                objU = uz.x0.u(rVarC, this);
                                if (objU != aVar) {
                                    leaderBoardUser = (LeaderBoardUser) objU;
                                    if (leaderBoardUser != null) {
                                        ((vt.d) cVar).m(LeaderBoardUser.copy$default(leaderBoardUser, null, 0, 0, null, null, null, null, null, null, false, false, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                                    }
                                    bool2 = Boolean.TRUE;
                                    this.f27851c = null;
                                    this.f27849a = null;
                                    this.f27850b = 6;
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
                objX = obj;
                obj2 = (ApiResponse) objX;
                if (obj2 instanceof ApiResponse.Error) {
                    bool = Boolean.FALSE;
                    this.f27851c = null;
                    this.f27849a = null;
                    this.f27850b = 2;
                    if (jVar.emit(bool, this) == aVar) {
                        return b0Var;
                    }
                } else {
                    if (obj2 instanceof ApiResponse.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h1Var = v1Var.f27911b;
                    ApiResponse.Success success2 = (ApiResponse.Success) obj2;
                    b1Var = new b1(success2, 1);
                    this.f27851c = jVar;
                    this.f27849a = success2;
                    this.f27850b = 3;
                    if (((x4) h1Var).u(b1Var, this) != aVar) {
                        i1Var = v1Var.f27915f;
                        do {
                            value = i1Var.getValue();
                        } while (!i1Var.j(value, ((MeDataFriendsUpdateResponse) ((ApiResponse.Success) obj2).getData()).getAll_followings()));
                        this.f27851c = jVar;
                        this.f27849a = null;
                        this.f27850b = 4;
                        ((vt.d) cVar).n(this);
                        if (b0Var != aVar) {
                            gp.r rVarC2 = v1Var.c(str);
                            this.f27851c = jVar;
                            this.f27849a = null;
                            this.f27850b = 5;
                            objU = uz.x0.u(rVarC2, this);
                            if (objU != aVar) {
                                leaderBoardUser = (LeaderBoardUser) objU;
                                if (leaderBoardUser != null) {
                                    ((vt.d) cVar).m(LeaderBoardUser.copy$default(leaderBoardUser, null, 0, 0, null, null, null, null, null, null, false, false, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                                }
                                bool2 = Boolean.TRUE;
                                this.f27851c = null;
                                this.f27849a = null;
                                this.f27850b = 6;
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
                obj2 = this.f27849a;
                com.bumptech.glide.e.F(obj);
                i1Var = v1Var.f27915f;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, ((MeDataFriendsUpdateResponse) ((ApiResponse.Success) obj2).getData()).getAll_followings()));
                this.f27851c = jVar;
                this.f27849a = null;
                this.f27850b = 4;
                ((vt.d) cVar).n(this);
                if (b0Var != aVar) {
                    gp.r rVarC3 = v1Var.c(str);
                    this.f27851c = jVar;
                    this.f27849a = null;
                    this.f27850b = 5;
                    objU = uz.x0.u(rVarC3, this);
                    if (objU != aVar) {
                        leaderBoardUser = (LeaderBoardUser) objU;
                        if (leaderBoardUser != null) {
                            ((vt.d) cVar).m(LeaderBoardUser.copy$default(leaderBoardUser, null, 0, 0, null, null, null, null, null, null, false, false, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                        }
                        bool2 = Boolean.TRUE;
                        this.f27851c = null;
                        this.f27849a = null;
                        this.f27850b = 6;
                        if (jVar.emit(bool2, this) == aVar) {
                            return b0Var;
                        }
                    }
                }
                return aVar;
            case 4:
                com.bumptech.glide.e.F(obj);
                gp.r rVarC4 = v1Var.c(str);
                this.f27851c = jVar;
                this.f27849a = null;
                this.f27850b = 5;
                objU = uz.x0.u(rVarC4, this);
                if (objU != aVar) {
                    leaderBoardUser = (LeaderBoardUser) objU;
                    if (leaderBoardUser != null) {
                        ((vt.d) cVar).m(LeaderBoardUser.copy$default(leaderBoardUser, null, 0, 0, null, null, null, null, null, null, false, false, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                    }
                    bool2 = Boolean.TRUE;
                    this.f27851c = null;
                    this.f27849a = null;
                    this.f27850b = 6;
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
                    ((vt.d) cVar).m(LeaderBoardUser.copy$default(leaderBoardUser, null, 0, 0, null, null, null, null, null, null, false, false, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                }
                bool2 = Boolean.TRUE;
                this.f27851c = null;
                this.f27849a = null;
                this.f27850b = 6;
                if (jVar.emit(bool2, this) == aVar) {
                    return aVar;
                }
                return b0Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
