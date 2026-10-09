package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class e extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public final int C;
    public final int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35848a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f35849a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35850b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f35851b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f35852c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f35853c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f35854d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f35855d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35856e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f35857e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35858f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f35859f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35860g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f35861g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35862h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f35863h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35864i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f35865i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35866j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f35867j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35868k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f35869k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35870l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f35871l0;
    public int m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f35872m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35873n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f35874n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35875o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f35876o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35877p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f35878p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35879q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public d4.g f35880q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f35881r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35882s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35883t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f35884u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f35885v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f35886w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f35887x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f35888y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f35889z;

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f35848a = -1;
        this.f35850b = -1;
        this.f35852c = -1.0f;
        this.f35854d = true;
        this.f35856e = -1;
        this.f35858f = -1;
        this.f35860g = -1;
        this.f35862h = -1;
        this.f35864i = -1;
        this.f35866j = -1;
        this.f35868k = -1;
        this.f35870l = -1;
        this.m = -1;
        this.f35873n = -1;
        this.f35875o = -1;
        this.f35877p = -1;
        this.f35879q = 0;
        this.f35881r = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f35882s = -1;
        this.f35883t = -1;
        this.f35884u = -1;
        this.f35885v = -1;
        this.f35886w = Integer.MIN_VALUE;
        this.f35887x = Integer.MIN_VALUE;
        this.f35888y = Integer.MIN_VALUE;
        this.f35889z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = null;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.f35849a0 = true;
        this.f35851b0 = true;
        this.f35853c0 = false;
        this.f35855d0 = false;
        this.f35857e0 = false;
        this.f35859f0 = false;
        this.f35861g0 = -1;
        this.f35863h0 = -1;
        this.f35865i0 = -1;
        this.f35867j0 = -1;
        this.f35869k0 = Integer.MIN_VALUE;
        this.f35871l0 = Integer.MIN_VALUE;
        this.f35872m0 = 0.5f;
        this.f35880q0 = new d4.g();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
            setMarginStart(marginLayoutParams.getMarginStart());
            setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (layoutParams instanceof e) {
            e eVar = (e) layoutParams;
            this.f35848a = eVar.f35848a;
            this.f35850b = eVar.f35850b;
            this.f35852c = eVar.f35852c;
            this.f35854d = eVar.f35854d;
            this.f35856e = eVar.f35856e;
            this.f35858f = eVar.f35858f;
            this.f35860g = eVar.f35860g;
            this.f35862h = eVar.f35862h;
            this.f35864i = eVar.f35864i;
            this.f35866j = eVar.f35866j;
            this.f35868k = eVar.f35868k;
            this.f35870l = eVar.f35870l;
            this.m = eVar.m;
            this.f35873n = eVar.f35873n;
            this.f35875o = eVar.f35875o;
            this.f35877p = eVar.f35877p;
            this.f35879q = eVar.f35879q;
            this.f35881r = eVar.f35881r;
            this.f35882s = eVar.f35882s;
            this.f35883t = eVar.f35883t;
            this.f35884u = eVar.f35884u;
            this.f35885v = eVar.f35885v;
            this.f35886w = eVar.f35886w;
            this.f35887x = eVar.f35887x;
            this.f35888y = eVar.f35888y;
            this.f35889z = eVar.f35889z;
            this.A = eVar.A;
            this.B = eVar.B;
            this.C = eVar.C;
            this.D = eVar.D;
            this.E = eVar.E;
            this.F = eVar.F;
            this.G = eVar.G;
            this.H = eVar.H;
            this.I = eVar.I;
            this.J = eVar.J;
            this.K = eVar.K;
            this.W = eVar.W;
            this.X = eVar.X;
            this.L = eVar.L;
            this.M = eVar.M;
            this.N = eVar.N;
            this.P = eVar.P;
            this.O = eVar.O;
            this.Q = eVar.Q;
            this.R = eVar.R;
            this.S = eVar.S;
            this.T = eVar.T;
            this.U = eVar.U;
            this.V = eVar.V;
            this.f35849a0 = eVar.f35849a0;
            this.f35851b0 = eVar.f35851b0;
            this.f35853c0 = eVar.f35853c0;
            this.f35855d0 = eVar.f35855d0;
            this.f35861g0 = eVar.f35861g0;
            this.f35863h0 = eVar.f35863h0;
            this.f35865i0 = eVar.f35865i0;
            this.f35867j0 = eVar.f35867j0;
            this.f35869k0 = eVar.f35869k0;
            this.f35871l0 = eVar.f35871l0;
            this.f35872m0 = eVar.f35872m0;
            this.Y = eVar.Y;
            this.Z = eVar.Z;
            this.f35880q0 = eVar.f35880q0;
        }
    }

    public final void a() {
        this.f35855d0 = false;
        this.f35849a0 = true;
        this.f35851b0 = true;
        int i11 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i11 == -2 && this.W) {
            this.f35849a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i12 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i12 == -2 && this.X) {
            this.f35851b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i11 == 0 || i11 == -1) {
            this.f35849a0 = false;
            if (i11 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i12 == 0 || i12 == -1) {
            this.f35851b0 = false;
            if (i12 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f35852c == -1.0f && this.f35848a == -1 && this.f35850b == -1) {
            return;
        }
        this.f35855d0 = true;
        this.f35849a0 = true;
        this.f35851b0 = true;
        if (!(this.f35880q0 instanceof d4.l)) {
            this.f35880q0 = new d4.l();
        }
        ((d4.l) this.f35880q0).T(this.V);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i17 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i11);
        boolean z11 = false;
        boolean z12 = 1 == getLayoutDirection();
        this.f35865i0 = -1;
        this.f35867j0 = -1;
        this.f35861g0 = -1;
        this.f35863h0 = -1;
        this.f35869k0 = this.f35886w;
        this.f35871l0 = this.f35888y;
        float f5 = this.E;
        this.f35872m0 = f5;
        int i18 = this.f35848a;
        this.f35874n0 = i18;
        int i19 = this.f35850b;
        this.f35876o0 = i19;
        float f11 = this.f35852c;
        this.f35878p0 = f11;
        if (z12) {
            int i21 = this.f35882s;
            if (i21 != -1) {
                this.f35865i0 = i21;
            } else {
                int i22 = this.f35883t;
                if (i22 != -1) {
                    this.f35867j0 = i22;
                } else {
                    i12 = this.f35884u;
                    if (i12 != -1) {
                        this.f35863h0 = i12;
                        z11 = true;
                    }
                    i13 = this.f35885v;
                    if (i13 != -1) {
                        this.f35861g0 = i13;
                        z11 = true;
                    }
                    i14 = this.A;
                    if (i14 != Integer.MIN_VALUE) {
                        this.f35871l0 = i14;
                    }
                    i15 = this.B;
                    if (i15 != Integer.MIN_VALUE) {
                        this.f35869k0 = i15;
                    }
                    if (z11) {
                        this.f35872m0 = 1.0f - f5;
                    }
                    if (this.f35855d0 && this.V == 1 && this.f35854d) {
                        if (f11 != -1.0f) {
                            this.f35878p0 = 1.0f - f11;
                            this.f35874n0 = -1;
                            this.f35876o0 = -1;
                        } else if (i18 != -1) {
                            this.f35876o0 = i18;
                            this.f35874n0 = -1;
                            this.f35878p0 = -1.0f;
                        } else if (i19 != -1) {
                            this.f35874n0 = i19;
                            this.f35876o0 = -1;
                            this.f35878p0 = -1.0f;
                        }
                    }
                }
            }
            z11 = true;
            i12 = this.f35884u;
            if (i12 != -1) {
                this.f35863h0 = i12;
                z11 = true;
            }
            i13 = this.f35885v;
            if (i13 != -1) {
                this.f35861g0 = i13;
                z11 = true;
            }
            i14 = this.A;
            if (i14 != Integer.MIN_VALUE) {
                this.f35871l0 = i14;
            }
            i15 = this.B;
            if (i15 != Integer.MIN_VALUE) {
                this.f35869k0 = i15;
            }
            if (z11) {
                this.f35872m0 = 1.0f - f5;
            }
            if (this.f35855d0) {
                if (f11 != -1.0f) {
                    this.f35878p0 = 1.0f - f11;
                    this.f35874n0 = -1;
                    this.f35876o0 = -1;
                } else if (i18 != -1) {
                    this.f35876o0 = i18;
                    this.f35874n0 = -1;
                    this.f35878p0 = -1.0f;
                } else if (i19 != -1) {
                    this.f35874n0 = i19;
                    this.f35876o0 = -1;
                    this.f35878p0 = -1.0f;
                }
            }
        } else {
            int i23 = this.f35882s;
            if (i23 != -1) {
                this.f35863h0 = i23;
            }
            int i24 = this.f35883t;
            if (i24 != -1) {
                this.f35861g0 = i24;
            }
            int i25 = this.f35884u;
            if (i25 != -1) {
                this.f35865i0 = i25;
            }
            int i26 = this.f35885v;
            if (i26 != -1) {
                this.f35867j0 = i26;
            }
            int i27 = this.A;
            if (i27 != Integer.MIN_VALUE) {
                this.f35869k0 = i27;
            }
            int i28 = this.B;
            if (i28 != Integer.MIN_VALUE) {
                this.f35871l0 = i28;
            }
        }
        if (this.f35884u == -1 && this.f35885v == -1 && this.f35883t == -1 && this.f35882s == -1) {
            int i29 = this.f35860g;
            if (i29 != -1) {
                this.f35865i0 = i29;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i17 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i17;
                }
            } else {
                int i30 = this.f35862h;
                if (i30 != -1) {
                    this.f35867j0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i17 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i17;
                    }
                }
            }
            int i31 = this.f35856e;
            if (i31 != -1) {
                this.f35861g0 = i31;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i16 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i16;
                return;
            }
            int i32 = this.f35858f;
            if (i32 != -1) {
                this.f35863h0 = i32;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i16 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i16;
            }
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35848a = -1;
        this.f35850b = -1;
        this.f35852c = -1.0f;
        this.f35854d = true;
        this.f35856e = -1;
        this.f35858f = -1;
        this.f35860g = -1;
        this.f35862h = -1;
        this.f35864i = -1;
        this.f35866j = -1;
        this.f35868k = -1;
        this.f35870l = -1;
        this.m = -1;
        this.f35873n = -1;
        this.f35875o = -1;
        this.f35877p = -1;
        this.f35879q = 0;
        this.f35881r = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f35882s = -1;
        this.f35883t = -1;
        this.f35884u = -1;
        this.f35885v = -1;
        this.f35886w = Integer.MIN_VALUE;
        this.f35887x = Integer.MIN_VALUE;
        this.f35888y = Integer.MIN_VALUE;
        this.f35889z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = null;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.f35849a0 = true;
        this.f35851b0 = true;
        this.f35853c0 = false;
        this.f35855d0 = false;
        this.f35857e0 = false;
        this.f35859f0 = false;
        this.f35861g0 = -1;
        this.f35863h0 = -1;
        this.f35865i0 = -1;
        this.f35867j0 = -1;
        this.f35869k0 = Integer.MIN_VALUE;
        this.f35871l0 = Integer.MIN_VALUE;
        this.f35872m0 = 0.5f;
        this.f35880q0 = new d4.g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f36028c);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            int i12 = d.f35847a.get(index);
            switch (i12) {
                case 1:
                    this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f35877p);
                    this.f35877p = resourceId;
                    if (resourceId == -1) {
                        this.f35877p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    this.f35879q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35879q);
                    break;
                case 4:
                    float f5 = typedArrayObtainStyledAttributes.getFloat(index, this.f35881r) % 360.0f;
                    this.f35881r = f5;
                    if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        this.f35881r = (360.0f - f5) % 360.0f;
                    }
                    break;
                case 5:
                    this.f35848a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f35848a);
                    break;
                case 6:
                    this.f35850b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f35850b);
                    break;
                case 7:
                    this.f35852c = typedArrayObtainStyledAttributes.getFloat(index, this.f35852c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35856e);
                    this.f35856e = resourceId2;
                    if (resourceId2 == -1) {
                        this.f35856e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35858f);
                    this.f35858f = resourceId3;
                    if (resourceId3 == -1) {
                        this.f35858f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35860g);
                    this.f35860g = resourceId4;
                    if (resourceId4 == -1) {
                        this.f35860g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35862h);
                    this.f35862h = resourceId5;
                    if (resourceId5 == -1) {
                        this.f35862h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35864i);
                    this.f35864i = resourceId6;
                    if (resourceId6 == -1) {
                        this.f35864i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35866j);
                    this.f35866j = resourceId7;
                    if (resourceId7 == -1) {
                        this.f35866j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35868k);
                    this.f35868k = resourceId8;
                    if (resourceId8 == -1) {
                        this.f35868k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35870l);
                    this.f35870l = resourceId9;
                    if (resourceId9 == -1) {
                        this.f35870l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                    this.m = resourceId10;
                    if (resourceId10 == -1) {
                        this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35882s);
                    this.f35882s = resourceId11;
                    if (resourceId11 == -1) {
                        this.f35882s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35883t);
                    this.f35883t = resourceId12;
                    if (resourceId12 == -1) {
                        this.f35883t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35884u);
                    this.f35884u = resourceId13;
                    if (resourceId13 == -1) {
                        this.f35884u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35885v);
                    this.f35885v = resourceId14;
                    if (resourceId14 == -1) {
                        this.f35885v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    this.f35886w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35886w);
                    break;
                case 22:
                    this.f35887x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35887x);
                    break;
                case 23:
                    this.f35888y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35888y);
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    this.f35889z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f35889z);
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                    break;
                case 27:
                    this.W = typedArrayObtainStyledAttributes.getBoolean(index, this.W);
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    this.X = typedArrayObtainStyledAttributes.getBoolean(index, this.X);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                    break;
                case 30:
                    this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                    break;
                case 31:
                    this.L = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case Consts.SP /* 32 */:
                    this.M = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                            this.N = -2;
                        }
                    }
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    try {
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.P) == -2) {
                            this.P = -2;
                        }
                    }
                    break;
                case 35:
                    this.R = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, typedArrayObtainStyledAttributes.getFloat(index, this.R));
                    this.L = 2;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    try {
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.O) == -2) {
                            this.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.Q) == -2) {
                            this.Q = -2;
                        }
                    }
                    break;
                case 38:
                    this.S = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, typedArrayObtainStyledAttributes.getFloat(index, this.S));
                    this.M = 2;
                    break;
                default:
                    switch (i12) {
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            p.n(this, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                            break;
                        case 46:
                            this.I = typedArrayObtainStyledAttributes.getFloat(index, this.I);
                            break;
                        case 47:
                            this.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                            break;
                        case 50:
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                            break;
                        case 51:
                            this.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35873n);
                            this.f35873n = resourceId15;
                            if (resourceId15 == -1) {
                                this.f35873n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f35875o);
                            this.f35875o = resourceId16;
                            if (resourceId16 == -1) {
                                this.f35875o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 55:
                            this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                            break;
                        default:
                            switch (i12) {
                                case 64:
                                    p.m(this, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    p.m(this, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                    break;
                                case 67:
                                    this.f35854d = typedArrayObtainStyledAttributes.getBoolean(index, this.f35854d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    public e(int i11, int i12) {
        super(i11, i12);
        this.f35848a = -1;
        this.f35850b = -1;
        this.f35852c = -1.0f;
        this.f35854d = true;
        this.f35856e = -1;
        this.f35858f = -1;
        this.f35860g = -1;
        this.f35862h = -1;
        this.f35864i = -1;
        this.f35866j = -1;
        this.f35868k = -1;
        this.f35870l = -1;
        this.m = -1;
        this.f35873n = -1;
        this.f35875o = -1;
        this.f35877p = -1;
        this.f35879q = 0;
        this.f35881r = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f35882s = -1;
        this.f35883t = -1;
        this.f35884u = -1;
        this.f35885v = -1;
        this.f35886w = Integer.MIN_VALUE;
        this.f35887x = Integer.MIN_VALUE;
        this.f35888y = Integer.MIN_VALUE;
        this.f35889z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = null;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.f35849a0 = true;
        this.f35851b0 = true;
        this.f35853c0 = false;
        this.f35855d0 = false;
        this.f35857e0 = false;
        this.f35859f0 = false;
        this.f35861g0 = -1;
        this.f35863h0 = -1;
        this.f35865i0 = -1;
        this.f35867j0 = -1;
        this.f35869k0 = Integer.MIN_VALUE;
        this.f35871l0 = Integer.MIN_VALUE;
        this.f35872m0 = 0.5f;
        this.f35880q0 = new d4.g();
    }
}
