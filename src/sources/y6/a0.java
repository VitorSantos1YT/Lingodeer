package y6;

import com.google.api.Service;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public static final a0 B;
    public final ImmutableList A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f57149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f57150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f57151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f57152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f57153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f57154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f57155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f57156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f57157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f57158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f57159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f57160l;
    public final Integer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f57161n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f57162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f57163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f57164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f57165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f57166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f57167t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CharSequence f57168u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f57169v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f57170w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CharSequence f57171x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f57172y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Integer f57173z;

    static {
        z zVar = new z();
        zVar.f57405z = ImmutableList.s();
        B = new a0(zVar);
        w4.c.s(0, 1, 2, 3, 4);
        w4.c.s(5, 6, 8, 9, 10);
        w4.c.s(11, 12, 13, 14, 15);
        w4.c.s(16, 17, 18, 19, 20);
        w4.c.s(21, 22, 23, 24, 25);
        w4.c.s(26, 27, 28, 29, 30);
        w4.c.s(31, 32, 33, 34, 1000);
    }

    public a0(z zVar) {
        Boolean boolValueOf = zVar.f57391k;
        Integer numValueOf = zVar.f57390j;
        Integer numValueOf2 = zVar.f57404y;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case Consts.SP /* 32 */:
                        case 33:
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case 35:
                            break;
                        case 20:
                        case Service.BILLING_FIELD_NUMBER /* 26 */:
                        case 27:
                        case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                        case 30:
                        default:
                            i11 = 0;
                            break;
                        case 21:
                            i11 = 2;
                            break;
                        case 22:
                            i11 = 3;
                            break;
                        case 23:
                            i11 = 4;
                            break;
                        case Service.METRICS_FIELD_NUMBER /* 24 */:
                            i11 = 5;
                            break;
                        case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                            i11 = 6;
                            break;
                    }
                    i13 = i11;
                }
                numValueOf = Integer.valueOf(i13);
            }
        } else if (numValueOf != null) {
            boolean z11 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z11);
            if (z11 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i12 = 21;
                        break;
                    case 3:
                        i12 = 22;
                        break;
                    case 4:
                        i12 = 23;
                        break;
                    case 5:
                        i12 = 24;
                        break;
                    case 6:
                        i12 = 25;
                        break;
                    default:
                        i12 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i12);
            }
        }
        this.f57149a = zVar.f57381a;
        this.f57150b = zVar.f57382b;
        this.f57151c = zVar.f57383c;
        this.f57152d = zVar.f57384d;
        this.f57153e = zVar.f57385e;
        this.f57154f = zVar.f57386f;
        this.f57155g = zVar.f57387g;
        this.f57156h = zVar.f57388h;
        this.f57157i = zVar.f57389i;
        this.f57158j = numValueOf;
        this.f57159k = boolValueOf;
        Integer num = zVar.f57392l;
        this.f57160l = num;
        this.m = num;
        this.f57161n = zVar.m;
        this.f57162o = zVar.f57393n;
        this.f57163p = zVar.f57394o;
        this.f57164q = zVar.f57395p;
        this.f57165r = zVar.f57396q;
        this.f57166s = zVar.f57397r;
        this.f57167t = zVar.f57398s;
        this.f57168u = zVar.f57399t;
        this.f57169v = zVar.f57400u;
        this.f57170w = zVar.f57401v;
        this.f57171x = zVar.f57402w;
        this.f57172y = zVar.f57403x;
        this.f57173z = numValueOf2;
        this.A = zVar.f57405z;
    }

    public final z a() {
        z zVar = new z();
        zVar.f57381a = this.f57149a;
        zVar.f57382b = this.f57150b;
        zVar.f57383c = this.f57151c;
        zVar.f57384d = this.f57152d;
        zVar.f57385e = this.f57153e;
        zVar.f57386f = this.f57154f;
        zVar.f57387g = this.f57155g;
        zVar.f57388h = this.f57156h;
        zVar.f57389i = this.f57157i;
        zVar.f57390j = this.f57158j;
        zVar.f57391k = this.f57159k;
        zVar.f57392l = this.m;
        zVar.m = this.f57161n;
        zVar.f57393n = this.f57162o;
        zVar.f57394o = this.f57163p;
        zVar.f57395p = this.f57164q;
        zVar.f57396q = this.f57165r;
        zVar.f57397r = this.f57166s;
        zVar.f57398s = this.f57167t;
        zVar.f57399t = this.f57168u;
        zVar.f57400u = this.f57169v;
        zVar.f57401v = this.f57170w;
        zVar.f57402w = this.f57171x;
        zVar.f57403x = this.f57172y;
        zVar.f57404y = this.f57173z;
        zVar.f57405z = this.A;
        return zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Objects.equals(this.f57149a, a0Var.f57149a) && Objects.equals(this.f57150b, a0Var.f57150b) && Objects.equals(this.f57151c, a0Var.f57151c) && Objects.equals(this.f57152d, a0Var.f57152d) && Objects.equals(this.f57153e, a0Var.f57153e) && Arrays.equals(this.f57154f, a0Var.f57154f) && Objects.equals(this.f57155g, a0Var.f57155g) && Objects.equals(this.f57156h, a0Var.f57156h) && Objects.equals(this.f57157i, a0Var.f57157i) && Objects.equals(this.f57158j, a0Var.f57158j) && Objects.equals(this.f57159k, a0Var.f57159k) && Objects.equals(this.m, a0Var.m) && Objects.equals(this.f57161n, a0Var.f57161n) && Objects.equals(this.f57162o, a0Var.f57162o) && Objects.equals(this.f57163p, a0Var.f57163p) && Objects.equals(this.f57164q, a0Var.f57164q) && Objects.equals(this.f57165r, a0Var.f57165r) && Objects.equals(this.f57166s, a0Var.f57166s) && Objects.equals(this.f57167t, a0Var.f57167t) && Objects.equals(this.f57168u, a0Var.f57168u) && Objects.equals(this.f57169v, a0Var.f57169v) && Objects.equals(this.f57170w, a0Var.f57170w) && Objects.equals(this.f57171x, a0Var.f57171x) && Objects.equals(this.f57172y, a0Var.f57172y) && Objects.equals(this.f57173z, a0Var.f57173z) && Objects.equals(this.A, a0Var.A);
    }

    public final int hashCode() {
        return Objects.hash(this.f57149a, this.f57150b, this.f57151c, this.f57152d, null, null, this.f57153e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f57154f)), this.f57155g, null, this.f57156h, this.f57157i, this.f57158j, this.f57159k, null, this.m, this.f57161n, this.f57162o, this.f57163p, this.f57164q, this.f57165r, this.f57166s, this.f57167t, this.f57168u, this.f57169v, this.f57170w, this.f57171x, null, this.f57172y, this.f57173z, true, this.A);
    }
}
