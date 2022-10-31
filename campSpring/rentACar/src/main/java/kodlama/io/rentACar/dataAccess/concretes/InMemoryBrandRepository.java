package kodlama.io.rentACar.dataAccess.concretes;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //Bu  sınıf bir DataAccess nesnesidir
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;


    public InMemoryBrandRepository() {
        brands =new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"Ford"));
        brands.add(new Brand(3,"Honda"));
        brands.add(new Brand(4,"Land Rover"));
        brands.add(new Brand(5,"Mercedes"));
    }

    @Override
    public List<Brand> getAll() {

        return brands;
    }
}
