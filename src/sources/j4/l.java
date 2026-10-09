package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.lingodeer.data.model.AchievementLevelType;
import com.stkouyu.util.httputil.Consts;
import com.yalantis.ucrop.UCrop;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final SparseIntArray f35933q0;
    public int A;
    public int B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35934a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f35935a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35936b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f35937b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35938c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f35939c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35940d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f35941d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35942e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f35943e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35944f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f35945f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f35946g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f35947g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35948h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f35949h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35950i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f35951i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35952j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int[] f35953j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35954k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f35955k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35956l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f35957l0;
    public int m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f35958m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35959n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f35960n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35961o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f35962o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35963p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f35964p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35965q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35966r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35967s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35968t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f35969u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f35970v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f35971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f35972x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f35973y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f35974z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f35933q0 = sparseIntArray;
        sparseIntArray.append(43, 24);
        sparseIntArray.append(44, 25);
        sparseIntArray.append(46, 28);
        sparseIntArray.append(47, 29);
        sparseIntArray.append(52, 35);
        sparseIntArray.append(51, 34);
        sparseIntArray.append(24, 4);
        sparseIntArray.append(23, 3);
        sparseIntArray.append(19, 1);
        sparseIntArray.append(61, 6);
        sparseIntArray.append(62, 7);
        sparseIntArray.append(31, 17);
        sparseIntArray.append(32, 18);
        sparseIntArray.append(33, 19);
        sparseIntArray.append(15, 90);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(48, 31);
        sparseIntArray.append(49, 32);
        sparseIntArray.append(30, 10);
        sparseIntArray.append(29, 9);
        sparseIntArray.append(66, 13);
        sparseIntArray.append(69, 16);
        sparseIntArray.append(67, 14);
        sparseIntArray.append(64, 11);
        sparseIntArray.append(68, 15);
        sparseIntArray.append(65, 12);
        sparseIntArray.append(55, 38);
        sparseIntArray.append(41, 37);
        sparseIntArray.append(40, 39);
        sparseIntArray.append(54, 40);
        sparseIntArray.append(39, 20);
        sparseIntArray.append(53, 36);
        sparseIntArray.append(28, 5);
        sparseIntArray.append(42, 91);
        sparseIntArray.append(50, 91);
        sparseIntArray.append(45, 91);
        sparseIntArray.append(22, 91);
        sparseIntArray.append(18, 91);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(56, 41);
        sparseIntArray.append(34, 42);
        sparseIntArray.append(17, 87);
        sparseIntArray.append(16, 88);
        sparseIntArray.append(71, 76);
        sparseIntArray.append(25, 61);
        sparseIntArray.append(27, 62);
        sparseIntArray.append(26, 63);
        sparseIntArray.append(60, 69);
        sparseIntArray.append(38, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
        sparseIntArray.append(58, 84);
        sparseIntArray.append(59, 86);
        sparseIntArray.append(58, 83);
        sparseIntArray.append(37, 85);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(34, 88);
        sparseIntArray.append(91, 89);
        sparseIntArray.append(15, 90);
    }

    public final void a(l lVar) {
        this.f35934a = lVar.f35934a;
        this.f35938c = lVar.f35938c;
        this.f35936b = lVar.f35936b;
        this.f35940d = lVar.f35940d;
        this.f35942e = lVar.f35942e;
        this.f35944f = lVar.f35944f;
        this.f35946g = lVar.f35946g;
        this.f35948h = lVar.f35948h;
        this.f35950i = lVar.f35950i;
        this.f35952j = lVar.f35952j;
        this.f35954k = lVar.f35954k;
        this.f35956l = lVar.f35956l;
        this.m = lVar.m;
        this.f35959n = lVar.f35959n;
        this.f35961o = lVar.f35961o;
        this.f35963p = lVar.f35963p;
        this.f35965q = lVar.f35965q;
        this.f35966r = lVar.f35966r;
        this.f35967s = lVar.f35967s;
        this.f35968t = lVar.f35968t;
        this.f35969u = lVar.f35969u;
        this.f35970v = lVar.f35970v;
        this.f35971w = lVar.f35971w;
        this.f35972x = lVar.f35972x;
        this.f35973y = lVar.f35973y;
        this.f35974z = lVar.f35974z;
        this.A = lVar.A;
        this.B = lVar.B;
        this.C = lVar.C;
        this.D = lVar.D;
        this.E = lVar.E;
        this.F = lVar.F;
        this.G = lVar.G;
        this.H = lVar.H;
        this.I = lVar.I;
        this.J = lVar.J;
        this.K = lVar.K;
        this.L = lVar.L;
        this.M = lVar.M;
        this.N = lVar.N;
        this.O = lVar.O;
        this.P = lVar.P;
        this.Q = lVar.Q;
        this.R = lVar.R;
        this.S = lVar.S;
        this.T = lVar.T;
        this.U = lVar.U;
        this.V = lVar.V;
        this.W = lVar.W;
        this.X = lVar.X;
        this.Y = lVar.Y;
        this.Z = lVar.Z;
        this.f35935a0 = lVar.f35935a0;
        this.f35937b0 = lVar.f35937b0;
        this.f35939c0 = lVar.f35939c0;
        this.f35941d0 = lVar.f35941d0;
        this.f35943e0 = lVar.f35943e0;
        this.f35945f0 = lVar.f35945f0;
        this.f35947g0 = lVar.f35947g0;
        this.f35949h0 = lVar.f35949h0;
        this.f35951i0 = lVar.f35951i0;
        this.f35957l0 = lVar.f35957l0;
        int[] iArr = lVar.f35953j0;
        if (iArr == null || lVar.f35955k0 != null) {
            this.f35953j0 = null;
        } else {
            this.f35953j0 = Arrays.copyOf(iArr, iArr.length);
        }
        this.f35955k0 = lVar.f35955k0;
        this.f35958m0 = lVar.f35958m0;
        this.f35960n0 = lVar.f35960n0;
        this.f35962o0 = lVar.f35962o0;
        this.f35964p0 = lVar.f35964p0;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f36040p);
        this.f35936b = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            SparseIntArray sparseIntArray = f35933q0;
            int i12 = sparseIntArray.get(index);
            switch (i12) {
                case 1:
                    this.f35965q = p.l(typedArrayObtainStyledAttributes, index, this.f35965q);
                    break;
                case 2:
                    this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                    break;
                case 3:
                    this.f35963p = p.l(typedArrayObtainStyledAttributes, index, this.f35963p);
                    break;
                case 4:
                    this.f35961o = p.l(typedArrayObtainStyledAttributes, index, this.f35961o);
                    break;
                case 5:
                    this.f35974z = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                    break;
                case 7:
                    this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                    break;
                case 8:
                    this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                    break;
                case 9:
                    this.f35971w = p.l(typedArrayObtainStyledAttributes, index, this.f35971w);
                    break;
                case 10:
                    this.f35970v = p.l(typedArrayObtainStyledAttributes, index, this.f35970v);
                    break;
                case 11:
                    this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                    break;
                case 12:
                    this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                    break;
                case 13:
                    this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                    break;
                case 14:
                    this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    break;
                case 15:
                    this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                    break;
                case 16:
                    this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    break;
                case 17:
                    this.f35942e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f35942e);
                    break;
                case 18:
                    this.f35944f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f35944f);
                    break;
                case 19:
                    this.f35946g = typedArrayObtainStyledAttributes.getFloat(index, this.f35946g);
                    break;
                case 20:
                    this.f35972x = typedArrayObtainStyledAttributes.getFloat(index, this.f35972x);
                    break;
                case 21:
                    this.f35940d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f35940d);
                    break;
                case 22:
                    this.f35938c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f35938c);
                    break;
                case 23:
                    this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    this.f35950i = p.l(typedArrayObtainStyledAttributes, index, this.f35950i);
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    this.f35952j = p.l(typedArrayObtainStyledAttributes, index, this.f35952j);
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    this.F = typedArrayObtainStyledAttributes.getInt(index, this.F);
                    break;
                case 27:
                    this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    this.f35954k = p.l(typedArrayObtainStyledAttributes, index, this.f35954k);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    this.f35956l = p.l(typedArrayObtainStyledAttributes, index, this.f35956l);
                    break;
                case 30:
                    this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                    break;
                case 31:
                    this.f35968t = p.l(typedArrayObtainStyledAttributes, index, this.f35968t);
                    break;
                case Consts.SP /* 32 */:
                    this.f35969u = p.l(typedArrayObtainStyledAttributes, index, this.f35969u);
                    break;
                case 33:
                    this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    this.f35959n = p.l(typedArrayObtainStyledAttributes, index, this.f35959n);
                    break;
                case 35:
                    this.m = p.l(typedArrayObtainStyledAttributes, index, this.m);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    this.f35973y = typedArrayObtainStyledAttributes.getFloat(index, this.f35973y);
                    break;
                case 37:
                    this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                    break;
                case 38:
                    this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    p.m(this, typedArrayObtainStyledAttributes, index, 0);
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    p.m(this, typedArrayObtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i12) {
                        case 61:
                            this.A = p.l(typedArrayObtainStyledAttributes, index, this.A);
                            break;
                        case 62:
                            this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                            break;
                        case 63:
                            this.C = typedArrayObtainStyledAttributes.getFloat(index, this.C);
                            break;
                        default:
                            switch (i12) {
                                case UCrop.REQUEST_CROP /* 69 */:
                                    this.f35943e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this.f35945f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    break;
                                case 72:
                                    this.f35947g0 = typedArrayObtainStyledAttributes.getInt(index, this.f35947g0);
                                    break;
                                case 73:
                                    this.f35949h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35949h0);
                                    break;
                                case 74:
                                    this.f35955k0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case AchievementLevelType.DAY_STREAK_LV_6 /* 75 */:
                                    this.f35962o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f35962o0);
                                    break;
                                case 76:
                                    this.f35964p0 = typedArrayObtainStyledAttributes.getInt(index, this.f35964p0);
                                    break;
                                case 77:
                                    this.f35966r = p.l(typedArrayObtainStyledAttributes, index, this.f35966r);
                                    break;
                                case 78:
                                    this.f35967s = p.l(typedArrayObtainStyledAttributes, index, this.f35967s);
                                    break;
                                case 79:
                                    this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                    break;
                                case 80:
                                    this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                    break;
                                case 81:
                                    this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                    break;
                                case 82:
                                    this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                    break;
                                case 83:
                                    this.f35937b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35937b0);
                                    break;
                                case 84:
                                    this.f35935a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35935a0);
                                    break;
                                case 85:
                                    this.f35941d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35941d0);
                                    break;
                                case 86:
                                    this.f35939c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35939c0);
                                    break;
                                case 87:
                                    this.f35958m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f35958m0);
                                    break;
                                case 88:
                                    this.f35960n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f35960n0);
                                    break;
                                case 89:
                                    this.f35957l0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.f35948h = typedArrayObtainStyledAttributes.getBoolean(index, this.f35948h);
                                    break;
                                case 91:
                                    Integer.toHexString(index);
                                    sparseIntArray.get(index);
                                    break;
                                default:
                                    Integer.toHexString(index);
                                    sparseIntArray.get(index);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
