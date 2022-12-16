package factorydesignprocess1;
public class FactoryBranch {
public Branch getFactory(int c) {
	switch(c) {
	case 1:
		return new Bt();
	case 2:
		return new Civil();
	case 3:
		return new Cse();
	default:
		return null;
	}
}
}
