package jt;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f37137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseWord f37138c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(u uVar, CourseWord courseWord, vy.d dVar, int i11) {
        super(2, dVar);
        this.f37136a = i11;
        this.f37137b = uVar;
        this.f37138c = courseWord;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f37136a) {
            case 0:
                return new r(this.f37137b, this.f37138c, dVar, 0);
            default:
                return new r(this.f37137b, this.f37138c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f37136a) {
            case 0:
                r rVar = (r) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                rVar.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                r rVar2 = (r) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                rVar2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x0193  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        int i12 = this.f37136a;
        CourseWord courseWord = this.f37138c;
        u uVar = this.f37137b;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i12) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                r2 r2VarC = uVar.c(courseWord);
                l1.b1 b1Var = uVar.f37194f;
                l1.b1 b1Var2 = uVar.f37195g;
                l1.b1 b1Var3 = uVar.f37196h;
                int[] iArr = q.f37116a;
                int i13 = iArr[r2VarC.ordinal()];
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (b1Var3.getValue() == null) {
                            i11 = iArr[r2VarC.ordinal()];
                            if (i11 == 1) {
                                b1Var.setValue(CourseWord.copy$default(this.f37138c, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null));
                            } else if (i11 == 2) {
                                b1Var2.setValue(CourseWord.copy$default(this.f37138c, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null));
                            } else if (i11 == 3) {
                                b1Var3.setValue(CourseWord.copy$default(this.f37138c, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null));
                            } else if (i11 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            u.b(uVar, courseWord, OptionItemSelectedState.SELECTED);
                            u.a(uVar);
                            uVar.f37191c.setValue(ht.q.SELECTED);
                        }
                    } else if (b1Var2.getValue() == null) {
                        i11 = iArr[r2VarC.ordinal()];
                        if (i11 == 1) {
                            b1Var.setValue(CourseWord.copy$default(this.f37138c, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null));
                        } else if (i11 == 2) {
                            b1Var2.setValue(CourseWord.copy$default(this.f37138c, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null));
                        } else if (i11 == 3) {
                            b1Var3.setValue(CourseWord.copy$default(this.f37138c, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null));
                        } else if (i11 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        u.b(uVar, courseWord, OptionItemSelectedState.SELECTED);
                        u.a(uVar);
                        uVar.f37191c.setValue(ht.q.SELECTED);
                    }
                } else if (b1Var.getValue() == null) {
                    i11 = iArr[r2VarC.ordinal()];
                    if (i11 == 1) {
                        b1Var.setValue(CourseWord.copy$default(this.f37138c, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null));
                    } else if (i11 == 2) {
                        b1Var2.setValue(CourseWord.copy$default(this.f37138c, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null));
                    } else if (i11 == 3) {
                        b1Var3.setValue(CourseWord.copy$default(this.f37138c, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null));
                    } else if (i11 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    u.b(uVar, courseWord, OptionItemSelectedState.SELECTED);
                    u.a(uVar);
                    uVar.f37191c.setValue(ht.q.SELECTED);
                }
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                r2 r2VarC2 = uVar.c(courseWord);
                l1.b1 b1Var4 = uVar.f37194f;
                l1.b1 b1Var5 = uVar.f37195g;
                l1.b1 b1Var6 = uVar.f37196h;
                int i14 = t.f37181a[r2VarC2.ordinal()];
                if (i14 == 1) {
                    CourseWord courseWord2 = (CourseWord) b1Var4.getValue();
                    if (courseWord2 != null) {
                        u.b(uVar, courseWord2, OptionItemSelectedState.DEFAULT);
                    }
                    b1Var4.setValue(null);
                } else {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            CourseWord courseWord3 = (CourseWord) b1Var6.getValue();
                            if (courseWord3 != null) {
                                u.b(uVar, courseWord3, OptionItemSelectedState.DEFAULT);
                            }
                            b1Var6.setValue(null);
                        } else if (i14 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return b0Var;
                    }
                    CourseWord courseWord4 = (CourseWord) b1Var5.getValue();
                    if (courseWord4 != null) {
                        u.b(uVar, courseWord4, OptionItemSelectedState.DEFAULT);
                    }
                    b1Var5.setValue(null);
                }
                u.a(uVar);
                uVar.f37191c.setValue((b1Var4.getValue() == null && b1Var5.getValue() == null && b1Var6.getValue() == null) ? ht.q.DEFAULT : ht.q.SELECTED);
                return b0Var;
        }
    }
}
