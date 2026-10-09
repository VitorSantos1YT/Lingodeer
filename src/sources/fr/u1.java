package fr;

import com.lingodeer.data.model.AchievementLeaderBoardType;
import com.lingodeer.data.model.uistate.LeaderBoardClass;
import com.lingodeer.data.model.uistate.LeaderBoardRankState;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.tbruyelle.rxpermissions3.BuildConfig;
import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends xy.i implements fz.e {
    public final /* synthetic */ String H;
    public final /* synthetic */ int K;
    public final /* synthetic */ v1 L;
    public final /* synthetic */ String M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LeaderBoardRankState f27879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y1 f27881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LeaderBoardClass f27884f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f27885t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(LeaderBoardClass leaderBoardClass, String str, String str2, int i11, v1 v1Var, String str3, vy.d dVar) {
        super(2, dVar);
        this.f27884f = leaderBoardClass;
        this.f27885t = str;
        this.H = str2;
        this.K = i11;
        this.L = v1Var;
        this.M = str3;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new u1(this.f27884f, this.f27885t, this.H, this.K, this.L, this.M, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0248  */
    /* JADX WARN: Code duplicated, block: B:104:0x024f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0252  */
    /* JADX WARN: Code duplicated, block: B:109:0x0259  */
    /* JADX WARN: Code duplicated, block: B:111:0x025c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0265  */
    /* JADX WARN: Code duplicated, block: B:117:0x0269  */
    /* JADX WARN: Code duplicated, block: B:120:0x026d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0275  */
    /* JADX WARN: Code duplicated, block: B:128:0x027c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x027e  */
    /* JADX WARN: Code duplicated, block: B:130:0x028a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0294  */
    /* JADX WARN: Code duplicated, block: B:133:0x029c  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:140:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:143:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:147:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:150:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:162:0x0318  */
    /* JADX WARN: Code duplicated, block: B:164:0x031b  */
    /* JADX WARN: Code duplicated, block: B:165:0x031e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0325  */
    /* JADX WARN: Code duplicated, block: B:182:0x0365  */
    /* JADX WARN: Code duplicated, block: B:185:0x0388  */
    /* JADX WARN: Code duplicated, block: B:191:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0208 A[EDGE_INSN: B:192:0x0208->B:87:0x0208 BREAK  A[LOOP:1: B:83:0x01ea->B:88:0x020b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01db  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x020b A[LOOP:1: B:83:0x01ea->B:88:0x020b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x022c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0239  */
    /* JADX WARN: Code duplicated, block: B:97:0x023c  */
    /* JADX WARN: Code duplicated, block: B:98:0x023f  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        String str;
        String strK;
        vt.n0 n0Var;
        LeaderBoardClass leaderBoardClass;
        String str2;
        z1 z1Var;
        int i11;
        String str3;
        String str4;
        int i12;
        LeaderBoardRankState rankIncrease;
        Integer num;
        String str5;
        boolean zEquals;
        String str6;
        LocalDate localDateA;
        LocalDate localDateA2;
        Integer numValueOf;
        Iterator<LeaderBoardUser> it;
        int i13;
        int i14;
        String previousClass;
        LocalDate localDateA3;
        String strB;
        Set set;
        boolean z11;
        y1 y1Var;
        String str7;
        y1 y1Var2;
        String str8;
        String str9;
        String str10;
        y1 y1Var3;
        String str11;
        int i15;
        LocalDate localDateMinusWeeks;
        Object objM;
        v1 v1Var = this.L;
        vt.n0 n0Var2 = v1Var.f27910a;
        Object obj4 = wy.a.COROUTINE_SUSPENDED;
        int i16 = this.f27883e;
        if (i16 == 0) {
            com.bumptech.glide.e.F(obj);
            LeaderBoardRankState.Empty empty = LeaderBoardRankState.Empty.INSTANCE;
            oz.o oVar = x1.f27961a;
            LeaderBoardClass leaderBoardClass2 = this.f27884f;
            kotlin.jvm.internal.m.f(leaderBoardClass2, "leaderBoardClass");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            List<LeaderBoardUser> leaderBoardUserList = leaderBoardClass2.getLeaderBoardUserList();
            if (leaderBoardUserList.size() < 3) {
                arrayList.addAll(leaderBoardUserList);
            } else if (kotlin.jvm.internal.m.a(leaderBoardClass2.getClassName(), AchievementLeaderBoardType.LEADERBOARD_CLASS_A)) {
                int size = leaderBoardUserList.size() / 2;
                arrayList.addAll(leaderBoardUserList.subList(0, size));
                arrayList2.addAll(leaderBoardUserList.subList(size, leaderBoardUserList.size()));
            } else {
                int size2 = leaderBoardUserList.size() / 3;
                arrayList.addAll(leaderBoardUserList.subList(0, size2));
                arrayList2.addAll(leaderBoardUserList.subList(size2, leaderBoardUserList.size() - size2));
                arrayList3.addAll(leaderBoardUserList.subList(leaderBoardUserList.size() - size2, leaderBoardUserList.size()));
            }
            int size3 = arrayList.size();
            int i17 = 0;
            do {
                if (i17 >= size3) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i17);
                i17++;
            } while (!kotlin.jvm.internal.m.a(((LeaderBoardUser) obj2).getUid(), ((o0) n0Var2).w()));
            String str12 = "keep_region";
            if (obj2 != null) {
                str = "upgrade_region";
            } else {
                int size4 = arrayList2.size();
                int i18 = 0;
                do {
                    if (i18 >= size4) {
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList2.get(i18);
                    i18++;
                } while (!kotlin.jvm.internal.m.a(((LeaderBoardUser) obj3).getUid(), ((o0) n0Var2).w()));
                str = obj3 != null ? "keep_region" : "downgrade_region";
            }
            StringBuilder sb2 = new StringBuilder();
            String second = this.f27885t;
            sb2.append(second);
            sb2.append(":");
            String currentClass = this.H;
            sb2.append(currentClass);
            sb2.append(":");
            int i19 = this.K;
            sb2.append(i19);
            strK = ep.a.k(sb2, ":", str);
            n0Var = n0Var2;
            kotlin.jvm.internal.m.e(((o0) n0Var).f27733a.curClassRank, "curClassRank");
            String curClassRank = ((o0) n0Var).f27733a.curClassRank;
            kotlin.jvm.internal.m.e(curClassRank, "curClassRank");
            if (curClassRank.length() == 0) {
                leaderBoardClass = leaderBoardClass2;
            } else {
                leaderBoardClass = leaderBoardClass2;
                List listW0 = oz.q.W0(curClassRank, new String[]{":"}, 0, 6);
                String str13 = (String) ry.m.t0(0, listW0);
                if (str13 != null) {
                    if (str13.length() <= 0) {
                        str13 = null;
                    }
                    if (str13 != null && (str2 = (String) ry.m.t0(1, listW0)) != null) {
                        if (str2.length() <= 0) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            str = str;
                            String str14 = (String) ry.m.t0(2, listW0);
                            Integer numT0 = str14 != null ? oz.x.t0(str14) : null;
                            str12 = "keep_region";
                            String str15 = (String) ry.m.t0(3, listW0);
                            if (str15 == null) {
                                str15 = BuildConfig.VERSION_NAME;
                            }
                            z1Var = new z1(str13, str2, numT0, str15);
                        }
                        if (z1Var != null) {
                            i11 = 1;
                            if (z1Var != null) {
                                str3 = z1Var.f27999a;
                            } else {
                                str3 = null;
                            }
                            if (kotlin.jvm.internal.m.a(str3, second)) {
                            }
                            str4 = strK;
                            i12 = 1;
                            rankIncrease = empty;
                            if (i12 != 0) {
                                this.f27879a = rankIncrease;
                                this.f27880b = null;
                                this.f27881c = null;
                                this.f27882d = i12;
                                this.f27883e = 2;
                                yz.f fVar = rz.o0.f50940a;
                                objM = rz.e0.M(yz.e.f58387a, new i0((o0) n0Var, str4, null, 4), this);
                                if (objM != wy.a.COROUTINE_SUSPENDED) {
                                    objM = qy.b0.f48488a;
                                }
                                if (objM == obj4) {
                                }
                            }
                            return rankIncrease;
                        }
                        str6 = z1Var.f27999a;
                        if (str6.equals(second)) {
                            i11 = 1;
                            if (z1Var != null) {
                                str3 = z1Var.f27999a;
                            } else {
                                str3 = null;
                            }
                            if (kotlin.jvm.internal.m.a(str3, second) || (num = z1Var.f28001c) == null || i19 >= num.intValue()) {
                                str4 = strK;
                                i12 = 1;
                                rankIncrease = empty;
                            } else {
                                int iIntValue = num.intValue() - i19;
                                String str16 = z1Var.f28002d;
                                if (str16.equals("downgrade_region")) {
                                    str5 = str;
                                    zEquals = ry.l.D(new String[]{str12, "upgrade_region"}, str5);
                                } else {
                                    str5 = str;
                                    zEquals = str16.equals(str12) ? "upgrade_region".equals(str5) : false;
                                }
                                rankIncrease = new LeaderBoardRankState.RankIncrease(iIntValue, str5, zEquals);
                                str4 = strK;
                                i12 = i11;
                            }
                        } else {
                            kotlin.jvm.internal.m.f(second, "second");
                            localDateA = x1.a(str6);
                            if (localDateA == null && (localDateA2 = x1.a(second)) != null) {
                                numValueOf = Integer.valueOf(localDateA.compareTo((ChronoLocalDate) localDateA2));
                            } else {
                                numValueOf = null;
                            }
                            if (numValueOf != null || numValueOf.intValue() < 0) {
                                it = leaderBoardClass.getPreLeaderBoardUserList().iterator();
                                i13 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i13 = -1;
                                        break;
                                    }
                                    if (kotlin.jvm.internal.m.a(it.next().getUid(), ((o0) n0Var).w())) {
                                        break;
                                    }
                                    i13++;
                                }
                                i14 = i13 + 1;
                                int size5 = leaderBoardClass.getPreLeaderBoardUserList().size();
                                kotlin.jvm.internal.m.f(currentClass, "currentClass");
                                previousClass = this.M;
                                kotlin.jvm.internal.m.f(previousClass, "previousClass");
                                localDateA3 = x1.a(second);
                                if (localDateA3 != null || (localDateMinusWeeks = localDateA3.minusWeeks(1L)) == null) {
                                    strB = null;
                                } else {
                                    strB = x1.b(localDateMinusWeeks);
                                }
                                if (strB == null) {
                                    y1Var2 = null;
                                } else {
                                    set = x1.f27962b;
                                    if (set.contains(currentClass)) {
                                        if (!set.contains(previousClass)) {
                                            previousClass = null;
                                        }
                                        if (previousClass == null) {
                                            if (!str6.equals(strB)) {
                                                z1Var = null;
                                            }
                                            if (z1Var != null) {
                                                str8 = z1Var.f28000b;
                                                if (!set.contains(str8)) {
                                                    str8 = null;
                                                }
                                            } else {
                                                str8 = null;
                                            }
                                            if (str8 == null) {
                                                y1Var2 = null;
                                            } else {
                                                previousClass = str8;
                                            }
                                        }
                                        if (1 <= i14 || i14 >= 4 || size5 < 3) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        if (currentClass.compareTo(previousClass) > 0) {
                                            if (z11) {
                                                y1Var = new y1(new LeaderBoardRankState.Top3UpgradeStatus(previousClass), previousClass, 4);
                                            } else {
                                                y1Var = new y1(LeaderBoardRankState.UpgradeStatus.INSTANCE, (String) null, 6);
                                            }
                                        } else if (currentClass.equals(previousClass)) {
                                            if (currentClass.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F) || !z11) {
                                                y1Var = new y1(LeaderBoardRankState.KeepStatus.INSTANCE, (String) null, 6);
                                            } else {
                                                y1Var = new y1(new LeaderBoardRankState.Top3UpgradeStatus(previousClass), previousClass, 4);
                                            }
                                        } else if (previousClass.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F) || !currentClass.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_A)) {
                                            y1Var = new y1(LeaderBoardRankState.DowngradeStatus.INSTANCE, (String) null, 6);
                                        } else {
                                            y1Var = new y1(LeaderBoardRankState.NewCircleStatus.INSTANCE, (String) null, 6);
                                        }
                                        str7 = y1Var.f27988b;
                                        if (str7 == null) {
                                            strB = null;
                                        }
                                        LeaderBoardRankState rankState = y1Var.f27987a;
                                        kotlin.jvm.internal.m.f(rankState, "rankState");
                                        y1Var2 = new y1(rankState, str7, strB);
                                    } else {
                                        y1Var2 = null;
                                    }
                                }
                                if (y1Var2 != null) {
                                    str9 = y1Var2.f27988b;
                                    if (str9 != null || (str10 = y1Var2.f27989c) == null) {
                                        i11 = 1;
                                        rankIncrease = y1Var2.f27987a;
                                        str4 = strK;
                                        i12 = i11;
                                    } else {
                                        vt.a aVar = v1Var.f27914e;
                                        this.f27879a = null;
                                        this.f27880b = strK;
                                        this.f27881c = y1Var2;
                                        this.f27882d = 1;
                                        this.f27883e = 1;
                                        if (((i) aVar).b(str9, str10, this) != obj4) {
                                            y1Var3 = y1Var2;
                                            str11 = strK;
                                            i15 = 1;
                                        }
                                    }
                                }
                            }
                            str4 = strK;
                            rankIncrease = empty;
                            i12 = 0;
                        }
                        if (i12 != 0) {
                            this.f27879a = rankIncrease;
                            this.f27880b = null;
                            this.f27881c = null;
                            this.f27882d = i12;
                            this.f27883e = 2;
                            yz.f fVar2 = rz.o0.f50940a;
                            objM = rz.e0.M(yz.e.f58387a, new i0((o0) n0Var, str4, null, 4), this);
                            if (objM != wy.a.COROUTINE_SUSPENDED) {
                                objM = qy.b0.f48488a;
                            }
                            if (objM == obj4) {
                            }
                        }
                        return rankIncrease;
                        return obj4;
                    }
                }
            }
            z1Var = null;
            if (z1Var != null) {
                i11 = 1;
                if (z1Var != null) {
                    str3 = z1Var.f27999a;
                } else {
                    str3 = null;
                }
                if (kotlin.jvm.internal.m.a(str3, second)) {
                }
                str4 = strK;
                i12 = 1;
                rankIncrease = empty;
                if (i12 != 0) {
                    this.f27879a = rankIncrease;
                    this.f27880b = null;
                    this.f27881c = null;
                    this.f27882d = i12;
                    this.f27883e = 2;
                    yz.f fVar3 = rz.o0.f50940a;
                    objM = rz.e0.M(yz.e.f58387a, new i0((o0) n0Var, str4, null, 4), this);
                    if (objM != wy.a.COROUTINE_SUSPENDED) {
                        objM = qy.b0.f48488a;
                    }
                    if (objM == obj4) {
                    }
                }
                return rankIncrease;
            }
            str6 = z1Var.f27999a;
            if (str6.equals(second)) {
                kotlin.jvm.internal.m.f(second, "second");
                localDateA = x1.a(str6);
                if (localDateA == null) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(localDateA.compareTo((ChronoLocalDate) localDateA2));
                }
                if (numValueOf != null) {
                    it = leaderBoardClass.getPreLeaderBoardUserList().iterator();
                    i13 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i13 = -1;
                            break;
                        }
                        if (kotlin.jvm.internal.m.a(it.next().getUid(), ((o0) n0Var).w())) {
                            break;
                            break;
                        }
                        i13++;
                    }
                    i14 = i13 + 1;
                    int size6 = leaderBoardClass.getPreLeaderBoardUserList().size();
                    kotlin.jvm.internal.m.f(currentClass, "currentClass");
                    previousClass = this.M;
                    kotlin.jvm.internal.m.f(previousClass, "previousClass");
                    localDateA3 = x1.a(second);
                    if (localDateA3 != null) {
                        strB = null;
                    } else {
                        strB = null;
                    }
                    if (strB == null) {
                        y1Var2 = null;
                    } else {
                        set = x1.f27962b;
                        if (set.contains(currentClass)) {
                            if (!set.contains(previousClass)) {
                                previousClass = null;
                            }
                            if (previousClass == null) {
                                if (!str6.equals(strB)) {
                                    z1Var = null;
                                }
                                if (z1Var != null) {
                                    str8 = z1Var.f28000b;
                                    if (!set.contains(str8)) {
                                        str8 = null;
                                    }
                                } else {
                                    str8 = null;
                                }
                                if (str8 == null) {
                                    y1Var2 = null;
                                } else {
                                    previousClass = str8;
                                }
                            }
                            if (1 <= i14) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (currentClass.compareTo(previousClass) > 0) {
                                if (z11) {
                                    y1Var = new y1(new LeaderBoardRankState.Top3UpgradeStatus(previousClass), previousClass, 4);
                                } else {
                                    y1Var = new y1(LeaderBoardRankState.UpgradeStatus.INSTANCE, (String) null, 6);
                                }
                            } else if (currentClass.equals(previousClass)) {
                                if (currentClass.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                                    y1Var = new y1(LeaderBoardRankState.KeepStatus.INSTANCE, (String) null, 6);
                                } else {
                                    y1Var = new y1(LeaderBoardRankState.KeepStatus.INSTANCE, (String) null, 6);
                                }
                            } else if (previousClass.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                                y1Var = new y1(LeaderBoardRankState.DowngradeStatus.INSTANCE, (String) null, 6);
                            } else {
                                y1Var = new y1(LeaderBoardRankState.DowngradeStatus.INSTANCE, (String) null, 6);
                            }
                            str7 = y1Var.f27988b;
                            if (str7 == null) {
                                strB = null;
                            }
                            LeaderBoardRankState rankState2 = y1Var.f27987a;
                            kotlin.jvm.internal.m.f(rankState2, "rankState");
                            y1Var2 = new y1(rankState2, str7, strB);
                        } else {
                            y1Var2 = null;
                        }
                    }
                    if (y1Var2 != null) {
                        str9 = y1Var2.f27988b;
                        if (str9 != null) {
                        }
                        i11 = 1;
                        rankIncrease = y1Var2.f27987a;
                        str4 = strK;
                        i12 = i11;
                    } else {
                        str4 = strK;
                        rankIncrease = empty;
                        i12 = 0;
                    }
                } else {
                    it = leaderBoardClass.getPreLeaderBoardUserList().iterator();
                    i13 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i13 = -1;
                            break;
                        }
                        if (kotlin.jvm.internal.m.a(it.next().getUid(), ((o0) n0Var).w())) {
                            break;
                            break;
                        }
                        i13++;
                    }
                    i14 = i13 + 1;
                    int size7 = leaderBoardClass.getPreLeaderBoardUserList().size();
                    kotlin.jvm.internal.m.f(currentClass, "currentClass");
                    previousClass = this.M;
                    kotlin.jvm.internal.m.f(previousClass, "previousClass");
                    localDateA3 = x1.a(second);
                    if (localDateA3 != null) {
                        strB = null;
                    } else {
                        strB = null;
                    }
                    if (strB == null) {
                        y1Var2 = null;
                    } else {
                        set = x1.f27962b;
                        if (set.contains(currentClass)) {
                            if (!set.contains(previousClass)) {
                                previousClass = null;
                            }
                            if (previousClass == null) {
                                if (!str6.equals(strB)) {
                                    z1Var = null;
                                }
                                if (z1Var != null) {
                                    str8 = z1Var.f28000b;
                                    if (!set.contains(str8)) {
                                        str8 = null;
                                    }
                                } else {
                                    str8 = null;
                                }
                                if (str8 == null) {
                                    y1Var2 = null;
                                } else {
                                    previousClass = str8;
                                }
                            }
                            if (1 <= i14) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (currentClass.compareTo(previousClass) > 0) {
                                if (z11) {
                                    y1Var = new y1(new LeaderBoardRankState.Top3UpgradeStatus(previousClass), previousClass, 4);
                                } else {
                                    y1Var = new y1(LeaderBoardRankState.UpgradeStatus.INSTANCE, (String) null, 6);
                                }
                            } else if (currentClass.equals(previousClass)) {
                                if (currentClass.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                                    y1Var = new y1(LeaderBoardRankState.KeepStatus.INSTANCE, (String) null, 6);
                                } else {
                                    y1Var = new y1(LeaderBoardRankState.KeepStatus.INSTANCE, (String) null, 6);
                                }
                            } else if (previousClass.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                                y1Var = new y1(LeaderBoardRankState.DowngradeStatus.INSTANCE, (String) null, 6);
                            } else {
                                y1Var = new y1(LeaderBoardRankState.DowngradeStatus.INSTANCE, (String) null, 6);
                            }
                            str7 = y1Var.f27988b;
                            if (str7 == null) {
                                strB = null;
                            }
                            LeaderBoardRankState rankState3 = y1Var.f27987a;
                            kotlin.jvm.internal.m.f(rankState3, "rankState");
                            y1Var2 = new y1(rankState3, str7, strB);
                        } else {
                            y1Var2 = null;
                        }
                    }
                    if (y1Var2 != null) {
                        str9 = y1Var2.f27988b;
                        if (str9 != null) {
                        }
                        i11 = 1;
                        rankIncrease = y1Var2.f27987a;
                        str4 = strK;
                        i12 = i11;
                    } else {
                        str4 = strK;
                        rankIncrease = empty;
                        i12 = 0;
                    }
                }
            } else {
                i11 = 1;
                if (z1Var != null) {
                    str3 = z1Var.f27999a;
                } else {
                    str3 = null;
                }
                if (kotlin.jvm.internal.m.a(str3, second)) {
                }
                str4 = strK;
                i12 = 1;
                rankIncrease = empty;
            }
            if (i12 != 0) {
                this.f27879a = rankIncrease;
                this.f27880b = null;
                this.f27881c = null;
                this.f27882d = i12;
                this.f27883e = 2;
                yz.f fVar4 = rz.o0.f50940a;
                objM = rz.e0.M(yz.e.f58387a, new i0((o0) n0Var, str4, null, 4), this);
                if (objM != wy.a.COROUTINE_SUSPENDED) {
                    objM = qy.b0.f48488a;
                }
                if (objM == obj4) {
                }
            }
            return rankIncrease;
            return obj4;
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LeaderBoardRankState leaderBoardRankState = this.f27879a;
            com.bumptech.glide.e.F(obj);
            return leaderBoardRankState;
        }
        i15 = this.f27882d;
        y1Var3 = this.f27881c;
        str11 = this.f27880b;
        com.bumptech.glide.e.F(obj);
        n0Var = n0Var2;
        y1Var2 = y1Var3;
        i11 = i15;
        strK = str11;
        rankIncrease = y1Var2.f27987a;
        str4 = strK;
        i12 = i11;
        if (i12 != 0) {
            this.f27879a = rankIncrease;
            this.f27880b = null;
            this.f27881c = null;
            this.f27882d = i12;
            this.f27883e = 2;
            yz.f fVar5 = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new i0((o0) n0Var, str4, null, 4), this);
            if (objM != wy.a.COROUTINE_SUSPENDED) {
                objM = qy.b0.f48488a;
            }
            if (objM == obj4) {
                return obj4;
            }
        }
        return rankIncrease;
    }
}
