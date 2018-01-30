# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Punto1
  def initialize()
    def   punto1( a, b)
      if(a%b==0)
        return b;
      else
        return punto1(b, a%b)
      end
      
    end
  end
end

prueba= Punto1.new()
prueba.punto1(5,1)
