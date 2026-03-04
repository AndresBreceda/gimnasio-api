import { Link } from "react-router-dom";
import "./Landing.css";

function Landing() {
  return (
    <div className="landing">
      <nav className="navbar">
        <h1 className="logo">IRON TEMPLE</h1>
        <Link to="/login" className="btn-primary">
          Iniciar Sesión
        </Link>
      </nav>

      <section className="hero">
        <h2>Transforma tu cuerpo. Domina tu mente.</h2>
        <p>
          Entrenamientos personalizados, equipo profesional y un ambiente
          diseñado para sacar tu máximo potencial.
        </p>
        <Link to="/login" className="btn-primary large">
          Únete Ahora
        </Link>
      </section>

      <section className="features">
        <div className="card">
          <h3>Entrenadores Certificados</h3>
          <p>Planes personalizados adaptados a tus objetivos.</p>
        </div>

        <div className="card">
          <h3>Equipamiento Premium</h3>
          <p>Máquinas modernas y área funcional completa.</p>
        </div>

        <div className="card">
          <h3>Comunidad</h3>
          <p>Ambiente motivador y orientado a resultados.</p>
        </div>
      </section>
    </div>
  );
}

export default Landing;