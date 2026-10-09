package u5;

import a0.p1;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f52802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f52803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f52804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f52805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f52806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f52807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f52808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f52809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f52810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p1 f52811j;

    public g() {
        this.f52802a = Math.sqrt(1500.0d);
        this.f52803b = 0.5d;
        this.f52804c = false;
        this.f52810i = Double.MAX_VALUE;
        this.f52811j = new p1();
    }

    public final void a(float f5) {
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f52803b = f5;
        this.f52804c = false;
    }

    public final void b(float f5) {
        if (f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f52802a = Math.sqrt(f5);
        this.f52804c = false;
    }

    public final p1 c(double d5, double d11, long j11) {
        double dSin;
        double dCos;
        if (!this.f52804c) {
            if (this.f52810i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d12 = this.f52803b;
            if (d12 > 1.0d) {
                double d13 = this.f52802a;
                this.f52807f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                double d14 = this.f52803b;
                double d15 = this.f52802a;
                this.f52808g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
            } else if (d12 >= 0.0d && d12 < 1.0d) {
                this.f52809h = Math.sqrt(1.0d - (d12 * d12)) * this.f52802a;
            }
            this.f52804c = true;
        }
        double d16 = j11 / 1000.0d;
        double d17 = d5 - this.f52810i;
        double d18 = this.f52803b;
        if (d18 > 1.0d) {
            double d19 = this.f52808g;
            double d20 = ((d19 * d17) - d11) / (d19 - this.f52807f);
            double d21 = d17 - d20;
            dSin = (Math.pow(2.718281828459045d, this.f52807f * d16) * d20) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d22 = this.f52808g;
            double dPow = Math.pow(2.718281828459045d, d22 * d16) * d21 * d22;
            double d23 = this.f52807f;
            dCos = (Math.pow(2.718281828459045d, d23 * d16) * d20 * d23) + dPow;
        } else if (d18 == 1.0d) {
            double d24 = this.f52802a;
            double d25 = (d24 * d17) + d11;
            double d26 = (d25 * d16) + d17;
            double dPow2 = Math.pow(2.718281828459045d, (-d24) * d16) * d26;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f52802a) * d16) * d26;
            double d27 = -this.f52802a;
            dCos = (Math.pow(2.718281828459045d, d27 * d16) * d25) + (dPow3 * d27);
            dSin = dPow2;
        } else {
            double d28 = 1.0d / this.f52809h;
            double d29 = this.f52802a;
            double d30 = ((d18 * d29 * d17) + d11) * d28;
            dSin = ((Math.sin(this.f52809h * d16) * d30) + (Math.cos(this.f52809h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d29 * d16);
            double d31 = this.f52802a;
            double d32 = this.f52803b;
            double d33 = (-d31) * dSin * d32;
            double dPow4 = Math.pow(2.718281828459045d, (-d32) * d31 * d16);
            double d34 = this.f52809h;
            double dSin2 = Math.sin(d34 * d16) * (-d34) * d17;
            double d35 = this.f52809h;
            dCos = (((Math.cos(d35 * d16) * d30 * d35) + dSin2) * dPow4) + d33;
        }
        float f5 = (float) (dSin + this.f52810i);
        p1 p1Var = this.f52811j;
        p1Var.f166a = f5;
        p1Var.f167b = (float) dCos;
        return p1Var;
    }

    public g(float f5) {
        this.f52802a = Math.sqrt(1500.0d);
        this.f52803b = 0.5d;
        this.f52804c = false;
        this.f52811j = new p1();
        this.f52810i = f5;
    }
}
